class Operator05 
{
	public static void main(String[] args) 
	{
		//비트연산자 : 2진수로 계산을 하는 연산자
		//			&, |, ~(부정 = !), ^(EOR = 두개가 다를때 참 t,f / f,t = true)

		int a = 10;
		int b = 3;
		int c = a & b;
		System.out.println("c="+c);
		int d = a | b;
		System.out.println("d="+d);
		
		// 음수인경우 2의 보수로 만든다.
		// 2의 보수는 1의 보수+1을 하면 된다.
		// 1의 보수는 0->1, 1->0
		int e = ~a;
		System.out.println("e="+e);
		
		int f = a ^ b;
		System.out.println("f="+f);

		//쉬프트연산자
		// << : 오른쪽에서 왼쪽으로 이동 , >> : 오른쪽으로 이동 
		// >>> : 오른쪽으로 이동(0으로 채워짐)    뾰족한쪽으로 이동
		
		int g = a<<2; // 40  -> * 곱하기
		System.out.println("g="+g);

		int h = a>>2; // 2  -> / 나누기
		System.out.println("h="+h);

		int i = a>>>2; //2
		System.out.println("i="+i);

		a = -10;

		int j = a>>2; 
		System.out.println("j="+j); //3

		int k = a>>>2; 
		System.out.println("k="+k); //61 이지만 int형으로 출력했기때문에 다른값이나옴
		
	
	}
}
