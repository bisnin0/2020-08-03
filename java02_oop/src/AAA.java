
public class AAA {
	static int num = 100;
}//class

class BBB{
	int num = 200;
	BBB(){}  //자기자신의 클래스를 객체로 만들어서 리턴해주는것
	static BBB getInstance() { //위에 BBB를 리턴하라는뜻
		return new BBB();
	}
}//class

class CCC{
	static int num = 300;
	static String name = "홍길동";
	static String addr ="서울시 마포구";
	
	
	//상수 만들기
	static final int MAX = 100; //대문자로 된 변수명은 상수로 만들겠다는 약속
	static final int MIN = 1; //상수가 된거다.(대문자로 된애들은 우리가 사용만 할 수있지 다른값으로 못바꾼다.)
	
	CCC(){}
	static void print() {  //public이 의미없어서 생략
		System.out.println("번호="+num);
		System.out.println("이름="+name);
		System.out.println("주소="+addr);
		//final 변수의 값은 수정불가
		// MAX = 200;
		System.out.println("MIN="+MIN+", MAX="+MAX);
		
	}
}//class
