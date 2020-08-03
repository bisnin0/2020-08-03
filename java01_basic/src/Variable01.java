class Variable01 
{
	public static void main(String[] args) 
	{	//주석 : 설명
		/*
			여러줄 주석문
			여러줄 주석문
		*/
		//변수 선언 = 기본데이터형, 레퍼런스형(객체형)
		//정수 : byte(1byte), short(2byte), int(4byte:정수형의 기본타입), long(8byte)
		//상수(실제데이터...예를들면 이름'홍길동') :	100, 50
		//계산식을 넣기전에 상수를 어딘가에 저장해야한다.
		//데이터형 변수       상수
		   byte korJumsu = 100;
		   int engJumsu = 50;
 			//합성어일때는 두번째 단어의 첫번째 문자는 대문자
			//'='는 대입문
			//명령어 한줄이 끝나면 ; 로 끊어줘야한다.
			int hap = korJumsu + engJumsu;

			//클래스.변수.메소드  prunt():출력 후 줄 안바꿈. println():출력 후 줄 바꿈(프린트라인), printf()  
            System.out.println(korJumsu);
            System.out.println(engJumsu);
            System.out.println(hap);

			System.out.println("국어="+korJumsu); //프린트라인에 두개의 값이 있을 수 없다. 하나로 합쳐야함 '+'로
			System.out.println("영어="+engJumsu);
			System.out.println("합계="+hap);
			//System = 자바 API (이미 만들어져 있는것)

			System.out.println(korJumsu+"+"+engJumsu+"="+hap);
			//"..." 는 문자열이다. 
			
			// byte num = 130; // 에러 : byte 의 한계값 127을 초과
			byte num = (byte)130; // 큰 데이터를 작은데이터에 강제로 넣을 수 있다. (byte로 지정할 수 있다.) => typecasting 이라고 부른다.
			System.out.println("num="+num);  // 결과값 -126이 출력된다.

			//byte형은 -128~127까지다. 127 이후를 표시할때는 -128로 돌아가서(다음데이터로넘어가서) 표시한다.
			//ex) 126, 127, -128, -127, -126

			int num2 = num;
			System.out.println("num2="+num2);
			//작은데이터 값에 들어가있는 값을 큰 데이터값에 넣을때는 typecasting을 안해도 된다.
	

	}
}
/*
변수 생성 규칙
1. 변수는 소문자로 시작한다.
2. 첫번째 문자는 영어, _(언더바), $만 가능하다.(그외에는 에러생긴다.)
3. 특수문자(_, $를 제외한 나머지 기호들)은 사용할 수 없다.
4. 합성어일때는 두번째 단어의 첫번째 문자는 대문자로 시작한다.
*/