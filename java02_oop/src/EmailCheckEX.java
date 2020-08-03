import java.util.Scanner;

public class EmailCheckEX {
	Scanner scan = new Scanner(System.in);
	final String EMAIL_MSG ="이메일 입력";
	final String QNA_MSG = "계속하시겠습니까?(Y:예, N:아니오)";
	
	public EmailCheckEX() {
		
		
	}
	
	public void emailCheckStart() {
		a:
		do {
			String email = getInput(EMAIL_MSG);//이메일입력

			if(emailCheck(email)){ //이부분 반드시 확인하기. 아래 정상검사를 끌고오는방법
				//정상메일
				emailOutput(email);//도메일, 아이디 분리 출력
				//계속유무확인
				do {
					String qna = getInput(QNA_MSG);
					
					if(qna.equalsIgnoreCase("Y")) {
						break;
						
					}else if(qna.equalsIgnoreCase("N")) {
						
						break a;
					}
					
				}while(true);
			}else {
				System.out.println("잘못된 이메일 주소 입니다. 다시 입력하세요..");//잘못메일이다.
			}
		}while(true);
		System.out.println("프로그램이 종료되었습니다.");
	}
	//계속유무확인
//	public boolean qna() { //조건이 세가지라 에러나서 지움
//		String qna = getInput(QNA_MSG);
//		if(qna.equalsIgnoreCase("Y")) { //Y
//			return true;			
//		}else if(!qna.equalsIgnoreCase("N")) {//Y,N 제외
//			qna();
//		}else {//N
//			return false;
//		}
//	}
	public void emailOutput(String email) {
		String emailCut[] = email.split("@");
		System.out.println("아이디="+emailCut[0]);
		System.out.println("도메인="+emailCut[1]);
	}
	
	//골뱅이, .검사
	public boolean emailCheck(String email) { //이게 email변수를 전달받는거다.
		//
		int atMark = email.indexOf("@"); //@위치의 index를 구하고 없을경우-1;
		int point = email.indexOf(".");//.위치구하기
								
		if(atMark<4 || point<6 || point<atMark || point-atMark<2 || atMarkCount(email,'@')!=1 || atMarkCount(email, '.')>2) { 
			//       0123456789012345678
			//이메일  = oaos@.asddamail.com //. 위치가 @보다 앞에 있으면 indexOf .-@ 했을때 -가 나온다.
			return false;  
		}else {
			return true; 
		}
	}	
	public int atMarkCount(String email, char str) {
		int cnt=0;
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				cnt++;
			}
		}
		return cnt;
		
	}	
	
	
//	public void emailCheckStart() {
//		do {
//			String email = getInput(EMAIL_MSG);//이메일입력
//			//유효성 검사		//이 값이 아래 String msg에 들어가고 그 아래 msg+"="에 표시되고
//			//		        //다시 돌아와서 email로 들어간다.
//			if(check(email,"@") && check(email,".")){ //이부분 반드시 확인하기. 아래 정상검사를 끌고오는방법
//				//정상메일
//			}else {
//				System.out.println("잘못된 이메일 주소 입니다. 다시 입력하세요..");//잘못메일이다.
//			}
//		}while(true);
//	}
	//골뱅이, .검사
//	public boolean check(String email, String p) { //이게 email변수를 전달받는거다.
//		//이메일 변수를 멤버로 빼던지 여기로 전해줘야한다.
//		int index = email.indexOf(p);//골뱅이가 있는지 없는지 찾는법. 이었다가  .이 있는지도 확인하는방법으로 수정
//									// String email만 있었고 p는 "@"였다.
//									//email CheckStart(){}안에 이프 조건은 check(email)이었다.
//									   //골뱅이 위치의 index를 구하고 없을경우 -1이 구해진다.
//		if(index>5) { //@가 문자열 4번째보다 뒤에 있을떄 
//			return true;  //true를 boolean에 리턴
//		}else
//			return false; //false를 boolean에 리턴
//	}
	

	//문자열 입력
	public String getInput(String msg) {
		System.out.print(msg+"=");
		return scan.nextLine();
	} 
	

	public static void main(String[] args) {
		new EmailCheckEX().emailCheckStart();
		
	}

}
