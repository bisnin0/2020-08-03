class Operator01
{
	public static void main(String[] args) 
	{
		// 산술연산자 : +, -, *, /, %(나머지를 구하는거)
		int num1 = 25;
		int num2 = 4;
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);   //데이터 안잡으면 데이터 사이즈 그대로 출력

		int mod = num1 % num2; //25를 4로 나눈 나머지.. 1이 계산결과 정수형이니 int
		System.out.printf("%d %s %d = %d\n", num1, "%", num2, mod);                     // %%넣어도 되나?

		// 증감연산자 : ++(1씩 증가), --(1씩 감소)
		num1++;			// num1 = num1 +1;   num1+=1; 둘 다 같은 내용인데 ++를 가장 많이씀
		System.out.printf("++ = %d\n", num1);	 // 결과값은 25에서 1 더한 26이 나옴

		num1--;		//num1 = num1-1;   num1-=1; 같은 수식
		System.out.printf("-- = %d\n", num1);

		int a = 10;
		int b = 5+ a++;
		int c = 5+ ++a;
		int d = 9+ --a;
		int f = 7+ a--;
		System.out.printf("a=%d, b=%d, c=%d, d=%d, f=%d\n", a, b, c, d, f);

		int r1 = num1++ + 7 - 3; //num1=26 ,r1=29    ++가 뒤에있으니 먼저 25+7-3을 계산 후 num에 1을 더한값을 다음으로 넘긴다.
		System.out.printf("num=%d, r1=%d\n", num1, r1);

		// 대입연산자 : +=, -=, /=, *=, %=
		num1 /=3;   // num1 = num1 / 3; 같은 뜻이다.
		// int r2 = num1 / 3; 이렇게 본인 아닌 다른 변수에 집어넣는건 대입연산자 못쓴다.
		System.out.printf("num1/=3 --> %d\n", num1);

	}
}
