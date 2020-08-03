//java.lang 팩키지 내의 클래스는 컴파일러가 알아서 추가를 해준다(굳이 안넣어도 된다. 생략가능)
//lang 팩키지 외의 다른 클래스는 무조건 import문을 써줘야한다.

import java.lang.String; // java라는 패키지 밑에 lang이 있고, lang패키지 밑에 String이 있으니 실행해라.
import java.lang.System;

class Operator02 
{
	public static void main(String[] args) 
	{
		int num = 10;
		int data = 5;

		// 비교(관계) 연산자 : 기본데이터 타입에 대한 비교라 String은 에러
		//                >, <, >=, <=, ==(같다.), !=(같지 않다.)
		boolean boo = 10 > 5;
		System.out.println("boo="+ boo);

		boolean boo2 = 20 <= num * 10 / 2 + 15 - --data;
		// 산술연산자는 비교연산자보다 우선순위가 높다.
		// 증감연산자는 산술연산자보다 우선순위가 높다.
		// --data 가 1번, * / + - 2번, <= 3번
		System.out.println("boo2="+ boo2);


		// 단항 연산자
		num = -num;
		System.out.println("num="+ num);  // num = -10

		// 삼항 연산자     = ( 1항  )? 2항  : 3항  ;
		//	=(조건식)?참일때:거짓일때;
		String str = (num  > 0)? "양수" : "음수" ;
		System.out.println("str="+str);


		// 콘솔에서 외부에서 데이터 입력받는것





	}
}
