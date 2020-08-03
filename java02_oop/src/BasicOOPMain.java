import java.lang.String;  // import 안해도 되지만 그냥 써봄
public class BasicOOPMain { //같은폴더 내에 있는건 import 안해도 된다.

	public static void main(String[] args) {
		String name = new String();
		
		
		//객체 생성               생성자는 객체생성할때 딱 한번 실행 : 객체의 초기화
		BasicOOP oop1 = new BasicOOP();
		BasicOOP oop2 = new BasicOOP();
		
		//객체 내의 메소드 호출방법 : 객체명.메소드명
		oop1.sum();
		
		String name2 = oop1.getName(); //BasicOOP의 메소드에서 리턴된 값을받아서 변수에 넣는다.
		System.out.println("name="+name2);
		
		//객체내의 멤버변수의 데이터를 얻어오거나 변경하기
		// 객체명.변수명
		oop1.a = 2500;
		
		System.out.println("oop.a = "+ oop1.a);
		System.out.println("oop2.a = "+ oop2.a);
		
	}

}
