import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeStart {
	Scanner scan = new Scanner(System.in);
	HashMap<String, EmployeeVO> list = new HashMap<String, EmployeeVO>(); //key에 이름, 정보?출력? EmployeeVO
	
	public EmployeeStart() {
		//로그인 .. 3번 입력할 수 있도록
		int loginCnt = 0; //로그인 횟수 카운트
		
		do {
			String userid = conInput("아이디");  //이렇게 쓰면 아래 msg에 아이디가 입력되어 아이디 = 으로 출력된다.
			String userpwd = conInput("비밀번호");
			Login login = new Login(); //객체생성
			if(login.empCheck(userid,  userpwd)) { //로그인 성공 확인
				//로그인 성공하면 메뉴를 보여줄거다.
				
				//사원 셋팅
				list = Login.setEmp(); //Login 아래에 만든 HashMap 확인 //초기화다. 이게 만약 아래 do 안에 있으면 메뉴 호출할때마다 데이터가 초기화 되어 수정된 내용이 반영 안된다. 
				do {
					
					
					// conInput에 데이터 넣고 바로 출력
					String menu = conInput("메뉴(1:사원목록, 2:사원등록, 3:사원수정, 4:사원삭제, 5:종료)"); //메뉴표시 .. 위 아이디때와 마찬가지로 입력해논게 conInput으로 들어가 양식에 맞게출력된다.
					if(menu.equals("1")) { //사원 목록 호출
						employeeList();
					}else if(menu.equals("2")){ //사원을 등록
						employeeInsert();
					}else if(menu.equals("3")){ //사원 수정
						employeeEdit();
					}else if(menu.equals("4")) {//사원 삭제
						employeeDelete();
					}else if(menu.equals("5")) {//종료 선택
						System.out.println("프로그램이 종료되었습니다.");
						System.exit(0);
					}else {
						System.out.println("메뉴를 잘못선택하였습니다.. 다시 선택하세요.");
					}
						
				}while(true);
				
			}else{  //로그인 실패
				loginCnt++;
				if(loginCnt>=3) {  //로그인횟수가 3번 넘으면 브레이크.. 3번까지 로그인 가능 
					break;
				}
			}
		}while(true);
		
	}
	
	public String conInput(String msg) { //아이디와 비밀번호 입력받는것
		System.out.print(msg+"=");
		return scan.nextLine();
	}
	//사원 목록
	public void employeeList() {
		Collection<EmployeeVO> valueList = list.values();   	//list는 멤버변수란에 선언한 HashMap 객체
		Iterator<EmployeeVO> ii = valueList.iterator();
		while(ii.hasNext()) {
			ii.next().output();  //ii.next()가 VO 이 안에 있는 output()을 호출
		}
	}
	
	
	//사원 등록
	public void employeeInsert() {
		//콘솔에서 입력받아서 그걸 VO에 넣어서 list(HashMap)에 추가한다.
		int num = Integer.parseInt(conInput("번호")); //문자 번호입력받아 인트로 바꿈
		String name = conInput("이름");
		String tel = conInput("연락처");
		String department = conInput("부서명");
		String position = conInput("직급");
		
		EmployeeVO vo = new EmployeeVO(num, name, tel, department, position);  //VO에 넣기 위한 객체를 만드는 작업
		
		list.put(name, vo); //이름으로 호출하고 정보는 방금 위에서 만든 vo에 들어있다.
		employeeList();
		
	}
	
	//사원 수정 .. 연락처, 부서명, 직급만
	public void employeeEdit() {
		String name = conInput("수정할 사원명");
		//사원명을 입력 받으면 사원명의 정보를 출력해줄거다. ex)이순신이면 이순신의 정보
		EmployeeVO vo = list.get(name);  //HashMap(list)에서 key(name)를 넘겨(get)받는다.
		if(vo!=null) {  //같지않으면
			vo.output(); //EmployeeVO에 있는 출력메소드 .. 사원 정보 출력
			String subMenu = conInput("수정할 항목을 선택하세요.(1:연락처, 2:부서명, 3:직급)");
			String data = conInput("수정할 데이터입력");  //입력한 데이터를 data에 넣는다. 
			if(subMenu.equals("1")) {
				vo.setTel(data);				//입력받은 데이터가 tel에 들어간다.
			}else if(subMenu.equals("2")) {
				vo.setDepartment(data);
			}else if(subMenu.equals("3")) {
				vo.setPosition(data);
			}else {
				System.out.println("수정할 항목을 잘못선택하였습니다.");
			}
		}else {
			System.out.println(name+"는 없는 사원입니다."); //값이 null(리스트에 없을떄)이면 출력.. 같으면
		}
		
	}
	//사원 삭제
	public void employeeDelete() {
		String key = conInput("삭제할 사원명"); //삭제할 사원명 입력하면 key에 들어간다.
		list.remove(key); //입력받은 key를 HashMap에서 삭제한다.
		
	}
	


	public static void main(String[] args) {
		new EmployeeStart(); 
	}

}
