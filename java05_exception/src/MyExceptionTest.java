
import java.util.InputMismatchException;
import java.util.Scanner;
public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);
	public MyExceptionTest() {
		
	}
	public void start() {
		do {
			
			
			try {
				System.out.println("정수를 입력(1~100) = ");
				int max = scan.nextInt();
				
				if(max<1 || max>100) { //1~100사이가 아닌 경우
					throw new MyException("abcde");//강제로 예외발생시키기
					//객체를 만들때 메시지 변경 가능 MyException에 (String msg)
				}  //이걸로 특정상황에서 강제로 예외생성시켜서 에러메시지 출력하게 할 수 있음
				sum(max);
			
			}catch(InputMismatchException e){
				System.out.println("문자를 입력하였습니다.");
			}catch(MyException me){
				System.out.println(me.getMessage());
			}
			
			
		}while(true);
	}
	public void sum(int max) {
		int s=0;
		for(int i=1; i<=max; i++) {
			s += i;
		}
		System.out.println("1~"+max+"까지의 합은"+s);
	}

	public static void main(String[] args) {
		new MyExceptionTest().start();
	}

}
