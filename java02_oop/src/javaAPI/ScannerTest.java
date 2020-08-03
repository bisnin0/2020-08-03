package javaAPI;
import java.util.Scanner; // lang 외의 클래스는 무조건 import

class ScannerTest    //만약 Scanner로만 쓰면 API에있는 Scanner를 사용할 수 없으니 주의. 내가 만든 Scanner가 우선이됨 
{
	public static void main(String[] args) 
	{
		// Scanner : 콘솔에서 숫자, 문자를 입력받을 수 있는 클래스
		//1. 클래스명을 직접적으로 사용(객체를 만들지 않고 사용)
		//2. 객체를 생성하여 사용하는 방법
		// new : 객체를 생성하는 키워드(예약어 : 미리 기능을 만들어놓은것)
		
	
		

		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력=");
		int data = scan.nextInt();  //문자로 입력받아 정수로 바꿔주는 메소드
			// int범위 안의 값을 입력받아라.int를 입력받으니 data는 int
			// nexInt() -> int, nextdouble() -> double, 
			// next() -> 한단어를 문자로 읽어옴
			// nextLine() -> 1줄을 문자로 읽어옴

		// 1,2,3,4,5,6,........ 
		// 짝수를 구하려면 2로 나눠서 0이 남으면 된다. 
//		String result = (data%2==0)?"짝수":"홀수"; //문자열이니 String .. 삼항연산자 짝수 홀수 구하는방법
		String result = (data/2==data/2.0)?"짝수":"홀수";
		// 10/2 10/2.0 5와 5.0 정수실수는 다르지만 값은 같은 값이다.
		// 9/2  9/2.0 4와 4.5로 다르게 나오니까 다른값이다.


		
	
		System.out.println(data+"는 "+ result+"입니다.");
		

		// new로 Scanner 객체를 생성해주고 이걸 scan변수로 지정해준다. 여기서 객체로 만들어진 변수인 scan은 레퍼런스변수라고 한다.



	}
}
