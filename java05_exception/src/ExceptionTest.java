

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest() {
	}

	public void start() {
		try{
		//두 수를 입력받아 합, 차, 곱, 몫을 구하는 프로그램을 작성한다.
		System.out.print("첫번째 수=");
		int n1 = scan.nextInt(); //------------------ 문자를 받아 정수로 만들어서 넘겨주는것. "A"같은걸 넣으면 못바꿔줌. 에러
		System.out.print("두번째 수=");
		int n2 = scan.nextInt(); //------------------ InputMismatchException 에러
		
		int hap = n1 + n2;
		int cha = n1 - n2;
		int gob = n1 * n2;
		int mok = n1 / n2;  //------------------ ArithmeticException:어떤수를 0으로 나누면 에러발생. 에러  by zero .. 0으로 나눌 수 없다.
		
		System.out.println("합:"+hap+", 차:"+cha+", 곱"+gob+", 몫"+mok);
		
		//					0		1		2
		String names[] = {"홍길동", "이순신", "세종대왕"};
		//			3
//		names[names.length] = "광개토대왕";
//		//names는 0,1,2인데 names.length는 3이니까 광개토대왕을 넣은 배열이 없어서 에러가난다.
//		
//		for(int i=0; i<=names.length; i++) {  배열길이가 3인데 i는 0부터 시작이니 4번실행 names[3]은 없다.
//			System.out.println("names["+i+"]="+names[i]);
			
			names[names.length-1] = "광개토대왕";
			//names는 0,1,2인데 names.length는 3이니까 광개토대왕을 넣은 배열이 없어서 에러가난다.
			
			for(int i=0; i<names.length; i++) {
				System.out.println("names["+i+"]="+names[i]);		
			
		}
		
		}catch(InputMismatchException ime) {
//			System.out.println(ime.getMessage()); //getmessage에는 null들어가있음
//			ime.printStackTrace(); //에러 메시지를 찍는기능
			System.out.println("숫자를 입력하여야 합니다...");  //메시지를 직접 찍어도 된다.
		}catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());  //getmessage에는 /by zero가 들어가있음
//			ae.printStackTrace();
			System.out.println("두번째 수는 0을 제외하고 입력하세요...");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열의 index가 잘못사용되었습니다. -->" + ae.getMessage());
		}finally {
			//try영역의 실행문 예외발생과 상관없이 무조건 실행되는 영역이다.
			System.out.println("finally:예외와 상관없이 무조건 실행됨..");
		}
		System.out.println("프로그램이 종료되었습니다."); //에러가 발생하면 이쪽으로 넘어와서 프로그램 종료 메시지
		
	}
	public static void main(String[] args) {
		new ExceptionTest().start();
		System.out.println("프로그램이 종료되었습니다.Main");
	}

}


/*
try{

	예외발생할 가능성이 있는 코드를 표기한다.

}catch(InputMismatchException e){
	
	발생한 예외 종류에 따라서 이동하는 곳

}[catch(){

}finally{

}]   --[] 사이는 생략 가능하다 



*/