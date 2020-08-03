import java.util.Scanner;

public class MethodTest {
	int dan; //멤버변수는 기본 초기값이 있다. 정수 = 0 실수 = 0.0 논리형 = false char형은 = 없다.
			 //모든 클래스 객체는 초기값이 null이다.
	
	
	//레퍼런스 변수 : 클래스형 변수
	Scanner s;
	String name;
	
	public MethodTest() {} //매개변수가 없는 생성자는 기본으로 생성해주는것이 좋다.
	
	
	//단입력 메소드
	public void getDan() { //접근제한자
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 = ");
		dan = scan.nextInt(); //여기에 입력 받아서 저 위 dan에 넣어라.
		
	}   
	
	
	//입력받은 단으로 구구단 출력
	public void danOutput() {
		for(int i=2; i<=9; i++) {
//			int result = dan * i;
//			System.out.println(dan+"*"+i+"="+result);
//계산하는 메소드 설명하면서  옮김
			calcurator(i);//메소드 호출 : 같은 클래스의 메소드는 그냥 메소드명으로 호출된다.
			//이걸 만나면 아래가 실행되는게 여기서 i는 지역변수기때문에 i를 넣어준다.
		}
	}
	//계산하는 메소드
	public void calcurator(int i) { 
		int result = dan * i;
		System.out.println(dan+"*"+i+"="+result);		
	}
	public void startDan() { //단을 입력받고 그 데이터로 구구단을 출력하는 메소드를 하나로 묶는것
		getDan();
		danOutput();
	}
}
