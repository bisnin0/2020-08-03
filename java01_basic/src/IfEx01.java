import java.util.Scanner;
class IfEx01 
{
	public static void main(String[] args) 
	{
/*
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 = ");
		int year = scan.nextInt();

		
		
		if (year%4==0)
		{
			System.out.println(year + "년은 윤년입니다.");
		}

		if (year%4!=0)
		{
			System.out.println(year + "년은 윤년이 아닙니다.");
		}

		if(){
			
		}
*/ //내가 푼 풀이


	Scanner scan = new Scanner(System.in);
		System.out.print("년도 = ");
		int year = scan.nextInt();
		// 4의 배수인 년도 100년단위로는 윤년이 아니다.   <-조건 추가
		// 400년에 한번씩은 무조건 윤년이다.   <- 조건 추가

/*		boolean result = year%4==0 && year%100!=0 || year%400==0;
		if(result){
			
		}
		if(!result){
			
		}
		이런식으로 쓰는게 더 간편하다.
*/ 


		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"는 윤년입니다.");
//https://ojs20022002.tistory.com/272 참고 조건 이해하기
//산술연산자>관계(비교)연산자>논리연산자(&&>||>!=)
// 사진확인

		}


		if (!(year%4==0 && year%100!=0 || year%400==0))
		{
			System.out.println(year + "년은 윤년이 아닙니다.");
		}

	

	}
}

/*
콘솔에서 년도를 입력받아 윤달인지 아닌지 구별하여 출력하라.

실행
년도 = 2020
2020년은 윤년입니다.

년도 - 2022
2022년은 윤년이 아닙니다.

*/