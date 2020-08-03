import java.util.Scanner;
public class EmailCheck {
	Scanner scan = new Scanner(System.in);
	String emailStr = "";
	
	
	public EmailCheck() {
				
	}
	//이메일 입력
	public void mail() {

		System.out.print("이메일 입력 (알파벳, 숫자만 가능)= ");
//		scan.nextLine();
		emailStr = scan.nextLine();

		
	}
	//오류검사 > 
	public void err() {
		//@, . 있는지 검사
		boolean b1=emailStr.contains("@") && emailStr.contains(".");
		
		if (!b1)
		{
		  System.out.println("잘못된 이메일 주소입니다.");
		  start();
		}		

		// @앞 문자열에 알파벳과 숫자를 제외한 다른게 입력되어있는지 확인
		int atMark2 = emailStr.indexOf("@");
		String id2 = emailStr.substring(0, atMark2);

		
		int[] a = new int[id2.length()];
		
		for(int i = 0; i < id2.length(); i++) {
			a[i] = (int)id2.charAt(i);
			if(65<=a[i] && 90>=a[i] || 97<=a[i] && 122>=a[i] || 48<=a[i] && 57>=a[i]) {
						continue;
			}else{
				System.out.println("잘못된 이메일 주소입니다.");
				start();
			}
		}

		
	}
	
	//출력 
	public void output() {

		int atMark = emailStr.indexOf("@");
		
		String id = emailStr.substring(0, atMark);
        System.out.println("id="+id);
        
        String domain = emailStr.substring(atMark+1); 
        System.out.println("domain="+domain);		
	
	}
	
	//종료여부 확인
	public String endQna() {
		System.out.println("계속하시겠습니까?(Y:예, N:아니오)");
		return scan.nextLine();
	}
	
	public void start() {
		a:
		do {
			mail();
			err();
			output();
			do {
				String qna = endQna();
				if(qna.equalsIgnoreCase("Y")) {
					break;
				}else if(qna.equalsIgnoreCase("N")){
					break a;
				}
				
			}while(true);
		}while(true);
		System.out.println("프로그램이 종료되었습니다.");
		
		

	}
	

	public static void main(String[] args) {
		EmailCheck OOP = new EmailCheck();
		OOP.start();
	}

}


/*
실행

 //이메일입력 = gogㅁㄴㅇㄹ.ㅁㄵㄷasas@nate.com
잘못된 이메일 주소 입니다.
이메일 입력 = jjjj@nate.com


이메일입력 = goguma@nate.com
아이디 = goguma
도메인 =nate.com
계속하시겠습니까?(Y:예, N:아니오)

어느부분을 파악해서 잘못된걸 체크해야할지 객체지향으로




*/