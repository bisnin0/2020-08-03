import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//추가할것. 회원가입시 전화번호 이메일 중복확인

public class LibraryStart {
	Scanner scan = new Scanner(System.in);
	HashMap<String, BookListVO> list = new HashMap<String, BookListVO>();
	HashMap<String, MemberVO> list2 = new HashMap<String, MemberVO>();
	Login login = new Login();
	int membernum = 6; //멤버 넘버 입력
	String userid;
	String userpwd;

	
	public LibraryStart() {
		int loginCnt = 0; //로그인 횟수
		list = BookList.setBook(); //도서목록 확인 초기화.. 위치이동?
		list2 = MemberList.setMemberList();
		a:
		do {//비회원 둘러보기
			
			String menu = conInput("1.도서목록   2.도서검색   3.로그인   4.회원가입   5.종료");
			if(menu.equals("1")) { //1. 도서목록 호출
				System.out.println("|도서 번호|          도서명                  |    저자        |발행 년도|  장르    |  비치여부    |");
				bookList(); 
			}else if(menu.equals("2")) { //2. 도서검색
				bookListSearch();
			}else if(menu.equals("3")) { //3. 로그인
				do {
//					String userid = conInput("아이디 입력");
					memberlogin();  //회원 정보를 이용해 로그인
					String userpwd = conInput("패스워드 입력");
//로그인 객체 위에 생성해봄					Login login = new Login();
					if(login.memberCheck(userid, userpwd)) {
	//					b:  //일반회원로그인
						do { //일반회원
							String menu2 = conInput("1.도서목록   2.도서검색   3.도서대출신청   4.도서반납   5.대출현황   6.개인정보수정   7.로그아웃   8.회원탈퇴   9.종료");
							if(menu2.equals("1")) { //1. 도서목록 호출
								System.out.println("|도서 번호|          도서명                  |    저자        |발행 년도|  장르    |  비치여부    |");
								bookList(); 
							}else if(menu2.equals("2")) { //2. 도서검색
								bookListSearch();
							}else if(menu2.equals("3")) { //3. 대출신청
								//목록 받아서 대출중으로 바꾸고, 대출현황에 추가.
								bookrent();
								
							}							
							
						}while(true); //일반회원 로그인 끝
					}else if(login.adminCheck(userid, userpwd)){//관리자 로그인
	//					c: //관리자로그인
							do {   
								String menu3 = conInput("1.도서목록   2.도서검색   3.도서추가   4.도서관 대출현황   5.회원목록   6.회원삭제   7.로그아웃   8.종료");			
							
								
							}while(true);//관리자 로그인 끝
					}
					loginCnt++;
					System.out.println("아이디나 비밀번호를 잘못 입력하셨습니다.");
					if(loginCnt>=3) { //아이디 비밀번호 3회 잘못 입력시 프로그램 종료 
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					}
				}while(true);
			}else if(menu.equals("4")) {
				memberInsert(); //회원 가입
			}else if(menu.equals("5")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			

		}while(true);// 비회원 둘러보기 끝
	}
	//회원 정보를 이용해 로그인.
	//아이디를 입력받으면 입력받은 아이디를 회원정보와 대조해 값이 있는지 찾고 있으면 회원정보에 있는 아이디와 패스워드를 로그인 클래스에 등록
	//관리자 아이디 입력받으면 관리자 로그인 창으로 넘어감.
	public void memberlogin() { 
		String id = conInput("아이디를 입력하세요");
		do {
			if(id.equals("admin")){
				userid = "admin";
				break;
			}
			MemberVO vo = list2.get(id);		
			if(vo!=null) {
				login.setUserid(id);
				String pass = vo.getPass();
				login.setUserpwd(pass);
				userid = id;				
				break;
			} 
		}while(true);
	}

	
	//회원 가입
	public void memberInsert() {
		do {
			int num = membernum;
			//num, id, pass, name, address, tel, email);
			String id = conInput("아이디 입력(최대 10자리)");  //10자리 확인
			MemberVO vo = list2.get(id);
			if(vo!=null) {
				System.out.println("이미 동일한 아이디가 있습니다.");
				break;
			}else {
				String pass = conInput("패스워드 입력(최대 10자리)");  //10자리 넘어가면 에러표시
				String name = conInput("이름 입력");
				String address = conInput("주소 입력(동까지만)");
				String tel = conInput("전화번호 입력"); //중복 확인 해보기
				bb();
				String email = conInput("Email 입력"); //중복 확인 해보기
				
				MemberVO vo3 = new MemberVO(num, id, pass, name, address, tel, email);
				list2.put(id, vo3);
				membernum++;
				memberList();
				break;
			}
		}while(true);
	}
	
	
	//만약 아이디와 전화번호 이메일중에 같은게 있으면 이미 같은게 있습니다 출력하고 다시물어보게만들기

	
	//도서 대출하기
	public void bookrent() {
		do {
			String name = conInput("대출할 도서명");
			BookListVO vo = list.get(name);
			if(vo!=null) {
				String rent = conInput("대출하시겠습니까?(1:예, 2:아니오)");
					if(rent.equals("1")) {
						vo.setRental("대여중");
						break;
					}else if(rent.equals("2")) {
						break;
					}
			}
		}while(true);
	}
	
	//중복검사 //배열넣어서 검사하는방향으로?
	public void bb() {


		
//		do {
//			String name = conInput(msg);
//			BookListVO vo = list.get(name);
//			if(vo!=null) {
//				
				
				
//				String rent = conInput("대출하시겠습니까?(1:예, 2:아니오)");
//					if(rent.equals("1")) {
//						vo.setRental("대여중");
//						break;
//					}else if(rent.equals("2")) {
//						break;
//					}

					

//					Iterator<MemberVO> ii = valueList.iterator();
//					while(ii.hasNext()) {
//						if(msg.equals("ii")) {
//							System.out.println("대여중");
////							break
//					}
//				}						
//			}
//		}while(true);
	}
	
	

	
	//중복확인


	//도서 검색 
	public void bookListSearch() {
		String book = conInput("도서명을 입력하세요 ");
		BookListVO bl = list.get(book);
		bl.print();
	}


	//입력 출력
	public String conInput(String msg) {
		System.out.print(msg + "=");
		return scan.nextLine();
	}
	
	
	//회원 목록 호출
	public void memberList() {
		Collection<MemberVO> valueList = list2.values();
		Iterator<MemberVO> ii = valueList.iterator();
		while(ii.hasNext()) {
			ii.next().output();
		}
	}	
	
	
	//도서 목록 호출
	public void bookList() {
		Collection<BookListVO> valueList = list.values();
		Iterator<BookListVO> ii = valueList.iterator();
		while(ii.hasNext()) {
			ii.next().output();
		}
	}

	public static void main(String[] args) {
		new LibraryStart();

		
	}


}
