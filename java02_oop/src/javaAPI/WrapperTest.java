package javaAPI;

public class WrapperTest {

	public WrapperTest() {
		
	}
	
	public void start() {
		//Wrapper 클래스:기본데이터형의 값을 객체로 생성할 수 있는 클래스들을 말한다.
		//Byte, Short, Integer, Long, Florat, Double, Boolean, Character
		
		int num = 15;
		// Integer numObj = new Integer(num); //15를 객체로 만든것... 선 그어진건 쓰지 말라고 권하는것.(조만간 없어질수있으니) 그래서 아래로
		Integer numObj = Integer.valueOf(num); // Int가 Integer로 바뀐것. 
		System.out.println("numObj="+numObj);
		
		Integer numObj2 = Integer.valueOf("1234")+2000; //정수로 바꾸는방법이 Integer.valueOf("1234") 라는것.  문자를 숫자로 바꾸는 작업.
		Integer numObj3 = Integer.parseInt("5555")+ 100;; // 문자를 숫자로 바꿔서 numObj3에 넣는 작업. 문자화된 숫자만 가능하다. "숫자" 
		System.out.println("numObj2="+numObj2);
		System.out.println("numObj3="+numObj3);
		
		Double numDb1 = Double.valueOf("52.36") + 10;  //실수로 바꾸는 Warpper 클래스 62.36
		System.out.println("numDb1="+numDb1);
		
												// JDK 1.5이후 버전부터 가능하다.
		Integer i =5; //일반데이터타입이 객체형으로 대입이 된것. autoboxing 오토박싱 : 기본데이터타입이 객체로 자동으로 바뀌는것
						//안되면 버전이 다른거니까 Integer numObj = Integer.valueOf(num); 이런식으로 넣어줘야 한다는것.
						// 보통 Integer numObj3 = Integer.parseInt("5555") 이걸 많이 쓴다.
						//숫자로 바꾸는건 똑같으니 개발자 마음
		
		int ii= i; //i는 Integer, ii는 Int = 오토언박싱 : 객체를 기본데이터형으로 자동으로 바뀌는것
		System.out.println(i+"=>"+ii);
	
		System.out.println("byte="+ numObj.BYTES); //4
		System.out.println("max+value="+Integer.MAX_VALUE);  //21억
		System.out.println("min_value="+Integer.MIN_VALUE);  //-21억
		System.out.println("size="+Integer.SIZE); //32
		
		System.out.println("hex="+Double.toHexString(235.3658)); //16진수 .. a=0x1 16진수
		
		System.out.println("intHex="+ Integer.toHexString(15));  //16진수 f= 15
		System.out.println("intOct="+ Integer.toOctalString(15)); // 8진수 17이 10진수로 15다.
		
		
		
	}
	
	
	public static void main(String[] args) {
		new WrapperTest().start();
	}

} //http://tcpschool.com/java/java_api_wrapper
