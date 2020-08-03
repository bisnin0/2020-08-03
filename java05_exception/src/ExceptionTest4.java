
//예외처리 두번째방식
public class ExceptionTest4 {
	int n1;
	int n2;
	
	public ExceptionTest4() {
//		plus();
//		minus();
//		multiple();
//		devide(); 안되는 이유는 아래 값이 int int 라서 아래 생성자가 실행된다.
		
	}
	public ExceptionTest4(int n1, int n2) throws ArithmeticException, NumberFormatException{
		this.n1 = n1;
		this.n2 = n2;
		plus();
		
		
	}
	public void plus() throws ArithmeticException, NumberFormatException{
		System.out.println("n1+n2="+(n1+n2));
		minus();
	}
	public void minus() throws ArithmeticException, NumberFormatException{
		System.out.println("n1-n2="+(n1-n2));
		int data = Integer.valueOf("천이백"); //숫자아닌 문자라 문자->정수처리(integer) 안됨.
		multiple();
	}
	public void multiple() throws ArithmeticException{
		System.out.println("n1*n2="+(n1*n2));
		devide();
	}
	public void devide() throws ArithmeticException{  //여기서 문제가 발생했지만 이걸 사용하는 메소드->메소드->메소드 순으로 throws를 다 써야하고 마지막 메인에는 try catch 
		System.out.println("n1/n2="+(n1/n2));  //ArithmeticException
	}
	public static void main(String[] args) {
		try { //우리가 쓸때는 이거 쓰는게 간단하다. throws보다.
			new ExceptionTest4(100,0); //int int생성자가 실행
		}catch(ArithmeticException e) {
			System.out.println("예외가 발생 하였습니다.");
		}catch(NumberFormatException n) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
	}

}
