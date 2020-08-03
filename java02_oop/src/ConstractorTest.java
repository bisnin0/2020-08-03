
public class ConstractorTest {
	int num=10;  //전역변수
	String name;
	String tel="010-1111-2222";
	  //생성자는 여러개 필요한만큼 만들 수 있지만 똑같은 데이터 갯수에 똑같은 데이터타입이면 안된다.	
	public ConstractorTest() { // 매개변수가 있는 다른 생성자가 없을때만 컴파일러가 생성해준다.
		
	}
	public ConstractorTest(int num) {  //지역변수 num
		System.out.println("ConstractorTest(int num) 생성자");
		num = num; //이렇게 하면 가까운 지역변수로
		this.num = num; //this는 현재 클래스. 이렇게 하면 전역변수로
		//변수 이름이 똑같지 않으면 안해도 된다. ex) num1
	}
	public ConstractorTest(String name) {
		
	}
	public ConstractorTest(int num, String name, String tel) {
		//생성자에서 다른 생성자를 호출하기 위해서는 반드시 첫번째 실행문으로 처리해야 한다.
//		ConstractorTest(num); //생성자에서 다른생성자를 호출하기위해 생성자 메소드를 쓸수는 없다. 그대신 this를 쓴다.
		this(num); //다른생성자 호출
		
		
		System.out.println("public ConstractorTest(int num, String name, String tel) 생성자");
		//this.num = num; 다른 생성자 호출예제 위해 주석처리함
		this.name = name;
		this.tel = tel;
	} // 위 아래 생성자는 데이터 갯수도 같고 변수도 같지만 순서가 다르다. 순서가 다르면 사용할 수 있다.
	public ConstractorTest(String name, String tel, int num) {
		this(num,name,tel);
	}
	public void prn() { //ct1, ct2, ct3에 각기 다른 자료가 있는데 이걸 선택해서 출력하게끔 만든것
		System.out.println("번호 = " + num);
		System.out.println("이름 = " + name);
		System.out.println("연락처 = " + tel);
		
	}
}
