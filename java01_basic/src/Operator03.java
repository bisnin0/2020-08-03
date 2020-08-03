import java.util.Scanner;
class Operator03 
{
	public static void main(String[] args) 
	{
		//객체
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력=");
		int data = s.nextInt();

		//                       true  false
		String result = (data>0)?"양수":(data<0)?"음수":"0";
		//                             ------------------ 한문장
		//              --------------------------------- 한문장
		System.out.printf("%d는 %s입니다.\n", data, result);
		
	}
}


/*
실행
정수입력=85 or 0

85는 양수이니다.
-85는 음수입니다.
0은 0입니다.

*/


