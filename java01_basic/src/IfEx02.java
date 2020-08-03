import java.util.Scanner;
class IfEx02 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수 = ");
		int first = scan.nextInt();
		System.out.print("두번째 수 = ");
		int second = scan.nextInt();

		if(first>0 && second>0){
			System.out.println("두 수가 양수 입니다.");
			System.out.println(first+"+"+second+"="+(first+second));
			System.out.println(first+"-"+second+"="+(first-second));
			System.out.println(first+"*"+second+"="+(first*second));
			System.out.println(first+"/"+second+"="+(first/second));			
		}
		if(first<0 || second<0){
			System.out.println("입력 값에 음수가 포함되어 있습니다.");
		}
	}
}


/*
반드시 if문만 사용
두 수를 입력받아 두 수가 양수 일때만 사칙연산을 하여 출력하라.

실행
첫번째 수=6
두번째 수=4
6 + 4 = 10
6 - 4 = 2
6 * 4 = 24
6 / 4 = 1


*/