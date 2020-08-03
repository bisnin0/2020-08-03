import java.util.Calendar;

public class StaticTest {

	public static void main(String[] args) {
		BBB b = new BBB();
		System.out.println("b.num="+b.num); //b에있는 num.. 생성된 객체를 이용 접근

		//static 키워드가 멤버변수에 표기될경우 객체를 생성하지 않고 접근할 수 있다. (AAA.java에있음)
		System.out.println("AAA.num="+AAA.num);
		
		CCC c1 = new CCC();
		CCC c2 = new CCC();
		CCC c3 = new CCC();
		
		//static 변수는 객체를 생성시 각 객체의 공통변수로 사용한다.
//		c1.name = "세종대왕"; 
		c3.print();
		
		//객체를 100만개를 만들어도 static은 하나만 만들어진다.
		//객체마다 따로따로 관리되어야 하는 데이터는 static을 사용하지 않는다.

		//static을 메소드에 표기하는경우 객체생성하지 않고 메소드를 호출할수 있다.
		CCC.print(); //"세종대왕"이 표시되는 이유 : 객체를 통해 변경했지만 클래스명을 통해접근했더니 바뀐데이터가 출력되고있다.
					// static에 객체로 변경한 값을 불러올경우 값이 바뀐것이 불러와진다.
		
		
		Math.random(); //메소드
		Calendar.getInstance(); //메소드
		
		
		BBB b2 = BBB.getInstance();
		System.out.println("b2.num="+b2.num);
	}

}
