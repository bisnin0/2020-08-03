import java.util.Scanner;
class ForEx03 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 = ");
		int a = scan.nextInt();
		for(int i=2;i<=9;i++){
			int b = a * i;
			System.out.printf("%d * %d = %d\n", a, i, b);
		}
	}
}


/*

입력받은 단을 출력하는 프로그램

실행
단입력 = 5
5 * 2 =10
:
:
5 * 9 = 45

*/
