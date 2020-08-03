

public class ExceptionTest2 {

	public ExceptionTest2() {
		try {
			int a=10;
			int b=20;
			String c="test";
//			String c="123"; //에러수정			
			int d = Integer.valueOf(c);  //에러-------------c는 문자. 문자를 integer로 바꿀수가없다.(숫자문자가 아니라 test라서.) NumberFormatException
			
			int arr[] = {100, 200, 300};
			arr[3] = 500;  //--------------
//			arr[2] = 500;
			
			int e = a / 0; //----------------
			
		}catch(ArithmeticException a) {
			System.out.println("0으로 나눌 수 없습니다...");
			
			
		}catch(Exception e){  //상위클래스. 어디서 에러가 생겨도 e로 들어온다. 이 Exception은 항상 마지막 catch문으로 들어와야한다.
			System.out.println(e.getMessage());
			
			
		}
	
	
	}

	public static void main(String[] args) {
		new ExceptionTest2();
	}

}
