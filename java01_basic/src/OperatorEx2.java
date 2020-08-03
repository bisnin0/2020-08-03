import java.util.Scanner;
class OperatorEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
			System.out.print("메뉴(1:사각형이 넓이, 2:사각형의 둘레) = ");
			int data = scan.nextInt();
			System.out.print("밑변 = ");
			int data2 = scan.nextInt();
			System.out.print("높이 = ");
			int data3 = scan.nextInt();

			String result = (data==1)?"사각형의 넓이는 = "+(int)data2*(int)data3:"사각형의 둘레는 = "+((int)data2+(int)data3)*2;
			System.out.print(result);

			//내가 푼 풀이
			//데이터 입력->계산->출력 순서지키자.
			
	


	}
}

/*
정답
import java.util.Scanner;
class OperatorEx2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//1. 데이터 입력
		System.out.print("메뉴(1:사각형이 넓이, 2:사각형의 둘레) = ");
		int menu = scan.nextInt();
		System.out.print("밑변->");
		int width = scan.nextInt();
		System.out.print("세로->");
		int height = scan.nextImt();


		//2. 계산
		int	result = (menu==1)? width&height : (width+height)*2;
		String msg = (menu==1)? "넓이" : "둘레";
		//3. 출력
		System.out.printf("사각형의 %s는 %d\n", msg, result);

	}
}
*/

/*
두 수를 입력받아 사각형의 넓이 또는 사각형의 둘레를 구하라
사각형의 넓이 = 밑변(가로) * 높이(세로)
사각형의 둘레 = (밑변+높이) * 2

실행 
메뉴(1:사각형의 넓이, 2:사각형의 둘레)-> 1
밑변 ->
높이 ->
사각형의 넓이는 ___

메뉴(1:사각형의 넓이, 2:사각형의 둘레)-> 2
밑변 ->
높이 ->
사각형의 둘레는 ___

*/