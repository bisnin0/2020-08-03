import java.util.Scanner;
class DowhileEx
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("정수입력 = ");
		
			int data = scan.nextInt();
			if(data<0){
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} 
			//0보다 크거나 같을때
			int sum = 0;
			int cnt = 0;
			int hap1 = 0;
			int hap2 = 0;
			do{
				sum+=cnt;
				if(cnt % 2 == 0) hap1+=cnt;
				if(cnt % 2 != 0) hap2+=cnt;
				cnt++;
			}while(data>=cnt);

			System.out.println("1~"+data+"까지의 합은 "+sum);
			System.out.println("1~"+data+"까지의 홀수의 합은 "+hap2);
			System.out.println("1~"+data+"까지의 짝수의 합은 "+hap1);
			
		}while(true);

	}
}

/*
==반드시 while 또는 do~while문==
== 0보다 작은수가 입력되면 프로그램이 종료된다.==
실행
정수입력 = 100
1~100까지의 합은5050
1~100까지의 홀수의 합은 2500
1~100까지의 짝수의 합은 2550

정수입력 = 150
1~150까지의 합은5050
1~150까지의 홀수의 합은 2500
1~150까지의 짝수의 합은 2550

정수입력 = -1(음수이면)
프로그램이 종료되었습니다.

*/