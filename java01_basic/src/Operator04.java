import java.util.Scanner;
class Operator04
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력:");
		int inData = scan.nextInt();
		// and : &&, or : ||, not = !
		String result = (inData>=1 && inData<=100)?" 있습니다":" 없습니다";
		System.out.println(inData+"는 값의 범위 내에"+result);

	}
}


/*
실행
정수입력:59

59는 값의 범위내에 있습니다.
-38는 값의 범위내에 없습니다.
0는 값의 범위내에 없습니다.

*/
 /*
 실행
 정수를 입력하세요. (1~100사이숫자)
 입력: 500, 5, -5

 수학은 1<=x<=100
 코딩에선 x>=1  x<=100 이 두개의 조건을 다 만족할때 
	   true	   true   => 둘 다 참. 
	   true    false  
	   false   true
 논리연산자 : &&(and)둘 다 참이어야 참, or(||) : 둘 중 하나라도 참이면 참, not(!) : 참은 거짓으로 거짓은 참으로 바꾼다.
           순서는 && > || > !
       
	   산술연산자>관계연산자>논리연산자
 */
 