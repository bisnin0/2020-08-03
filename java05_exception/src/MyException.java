

public class MyException extends Exception{

	public MyException() {
		super("1~100사이의 값을 입력하세요..");//상위클래스에 있는 생성자super.. 매개변수 없는 생성자 호출super();
		
	}
	public MyException(String msg) {  //외부에서 msg를 받아서 Exception에서 호출
		super(msg);
		
	}

}
