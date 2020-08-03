import java.util.Scanner;
class OperatorEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("급여입력=");
		int pay = scan.nextInt();
		double a = pay*0.1;
		double b = pay*0.05;
		double result = (pay>=2000000)?b:a;
		System.out.println("급여="+pay);
		System.out.println("보너스="+(int)result);
		double all = pay + result;
		System.out.println("지급액="+(int)all);
		//내가 푼 풀이
		

	}
} 

/*
정답
import java.util.Scanner;
class OperatorEx
{
	public static void main(String[] srgs)
	{
		Scanner scan = new Scanner(System.in);

		//1. 급여입력
		System.out.print("급여입력=");
		int salary = scan.nextInt();
		//2. 계산            2000000이상일때 2000000미만일때
		double bonus= (salary>=2000000)?salary*0.05:salary*0.1;
		double payment = salary + bonus;
		//3. 출력
		System.out.printf("급여=%d\n보너스=%f\n지급액=%f\n", salary, bonus, payment);
	}

}

*/
/*
급여를 입력받아 급여가 200만원 미만이면 보너스를 10% 지급하고,
급여가 200만원 이상이면 보너스를 5%지급하는 프로그램을 작성하라

실행
급여입력=_____
급여=
보너스=
지급액=

*/