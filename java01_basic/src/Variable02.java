class Variable02 
{
	public static void main(String[] args) 
	{
		//실수 : float(4byte), double(8byte:실수형의 기본)

		//float num = 10.5; 에러
		float num = (float)10.5; //형변환, float num = 10.5f; 도 같은 뜻
		double num2 = 25.5;

		System.out.println("num="+ num);
		System.out.println("num2="+ num2);
		//정수와 정수를 계산하면 정수가 나온다.(정수,정수=정수) 정수와 실수를 계산하면 실수가 나온다.(정수,실수=실수)
		double result = num2 / 5; //실수와 정수니까 double
		int resultInt = 15/4; // 정수와 정수니까 계산하면 정수가 나온다.(소수 이하를 버린다.)
		System.out.println("result="+ result);
		System.out.println("resultInt="+ resultInt);

		double resultInt2 = 15/(double)4; //실수형변환 하면 앞의 int도 double로 변환
		System.out.println("resultInt2="+ resultInt2);

		//논리형 데이터 처리 boolean형
		boolean boo = true;  // 거짓은 false
		System.out.println("boo="+boo);
		//문자형 : 1글자, char에는 ''를 붙여야함
		char c1 = 'A';
		char c2 = '홍';
		System.out.println(c1+","+ c2);

		c1++;

		System.out.println("c1="+ c1);
		//아스키코드 대문자 A : 65, B : 66 (A:65정도는 외우기) 소문자 a : 97
		//아스키코드 표 참조

		// c1 = c1 + 1; 
		// 에러나는 이유 : int형을 char형 변수에 넣으려고 했기 때문에. int는 +-21억 4바이트 char는 2바이트. int가 더 크기때문에 오류나고 형변환해야한다.
		c1 = (char)(c1 + 1); //c1을 1 증가하는 식 
		// = 을 기준으로 해서 오른쪽을 먼저 계산하고 그 결과를 왼쪽으로 집어넣는다.
		
		System.out.println("c1="+ c1);

		c1 = (char)120;
		System.out.println("c1="+c1);
		
		String userName = "홍길동";
		String addr = "서울시 마포구 신수동";
		//String이란 클래스는 일반 변수처럼 사용할 수 있게끔 만들어져있다. 특이한 클래스
		System.out.println(userName);
		System.out.println(addr);

		//이곳에 있는 변수들은 main 메소드의 지역변수들이다. 이 변수들은 stack에 들어간다.
		//Stack : 바구니에 위에서부터 순서대로 변수를 집어넣어 제일 위 변수가 제일 밑으로 들어가게
		//Stack : First In Last out 먼저 들어간 변수가 밑에 쌓여 늦게나오고 뒤늦게 들어간 변수는 먼저 나온다.

	}
}
