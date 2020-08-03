import java.util.Calendar;

public class GenericMain {

	public GenericMain() {
		
	}

	public void start() {
		String str = "홍길동";  //이걸 GenericTest 클래스에 담으려면 GenericTest를 객체로 만들고
		                      //GenericTest에 있는 setName를 호출한다.
		GenericTest gt = new GenericTest();
		gt.setName(str);
		
		System.out.println(gt.getName());
		
//		gt.setName(1234); //숫자 넣으면 에러난다.
		gt.setName(String.valueOf(1234)); //숫자를 문자로 전환하는방법
		
		//제너릭
		GenericTest<Calendar> gt2 = new GenericTest<Calendar>();
		gt2.setName(Calendar.getInstance());
		
		Calendar date = gt2.getName();
		System.out.println(date);
		
		
	}
	public static void main(String[] args) {
		new GenericMain().start();
	}

}
