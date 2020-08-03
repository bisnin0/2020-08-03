public class PrintfTest
{
	//static public void main(String[] args) 가능
	//public static void main(String args[]) 가능 
	//public static void main(String data[]) 가능
	//main 메소드는 프로그램의 시작을 알리는 중요한 메소드
	
	//public static void mainTest(String[] args) <메인메소드가 없어서 에러남
	public static void main(String[] args)
		//메소드는 소문자로 시작한다. 대문자로 시작하는건 클래스와 final 상수 둘만
		
	{
		//
		String msg = "두번째 자바공부중...";
		System.out.println(msg);

		// printf() : 출력 형식을 포멧으로 설정한다.
		// double result = 10 / 3;       // 두개 다 정수면 정수로 값이 나와서 결과는 3이나온다.
		double result = 10 / (double)3;      //하나를 실수로 변환(typecasting)해서 정수 + 실수 : 실수가 나온다.
		// double result = 10 / 3.0; // 위에것과 마찬가지지만 .0만 찍어도 실수로 변환 
		System.out.println("result="+ result);

		// 포멧을 지정하는 기본 데이터 형식은 정수, 실수, 문자열
		int numInt = 1234;
		String userName = "홍길동";
		// 정수 format : %10d = 총 10자리로 표시해라
		System.out.printf("numInt(정수)=%10d\n",numInt);
		// ^^^^^^1234 <출력값이 이렇게 지정되는걸 포멧.(^:공백)
		
		// 실수 format : %10.2f (전체 10자리중에 소수이하 2자리로 표시해라)
		System.out.printf("result=%10.2f\n", result);

		// 문자 fotmat : %10s = 총 10자리로 표시해라
		System.out.printf("이름=%10s",userName);
		
		System.out.println();
		// 한번에 여러 데이터 출력
		System.out.printf("%6.1f, %7d, %5s\n", result, numInt, userName);

		// * 제어문자
		// 이름 출력 : 내 이름은 "홍길동"입니다.
//		System.out.printf("내 이름은"%s"입니다." );  // %s 같이 숫자 안넣으면 데이터값만큼 출력
								//"" %s "" 따옴표가 없는걸로 취급됨
		System.out.printf("\t내 이름은\"%s\"입니다.\n", userName);  // \(백슬레시)
		// 제어문자 : \", \', \n (newline : 줄을 바꿔라 ln과같음), \t (tab : 한번 입력할때마다 8칸 이동)

		// 이름출력 : 내 이름은 \홍길동\입니다.
//		System.out.printf("\t내 이름은\%s\입니다.\n", userName);  //이렇게 입력하면 \다음 %가 제어문자가 되어 제대로 출력 안된다.
		System.out.printf("\t내 이름은\\%s\\입니다.\n", userName); 

		
	}
}
