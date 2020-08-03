
public class ConstractorTestMain {

	public static void main(String[] args) {
		
		ConstractorTest ct1 = new ConstractorTest(); // ConstractorTest()가 실행된다.
		ConstractorTest ct2 = new ConstractorTest(999); // ConstractorTest(int num)이 실행된다. 정수가 하나니까
		ConstractorTest ct3 = new ConstractorTest(555, "홍길동", "7777-8888"); 
		//객체를 이렇게 만드는 순간 public ConstractorTest(int num, String name, String tel)만 실행된다. 
		ct1.prn();
		ct2.prn();
		ct3.prn();
		ConstractorTest ct4 = new ConstractorTest("세종대왕","5656-7878", 333);
		ct4.prn();
		
		
		byte data[] = {65, 69, 70, 78, 66};
		String dataObj= new String(data);
		System.out.println(dataObj);
		
		
		
		
		
	}

}
