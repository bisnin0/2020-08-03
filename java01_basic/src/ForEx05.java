import java.util.Scanner;
class ForEx05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의 수=");
		int su = scan.nextInt();
		int sum=0;

		for(int i=1;;i++){ //조건 비워두면 무한루프
			sum +=i;
			if(su<=sum){
				System.out.print("1에서 "+i+"까지의 합은"+sum+"이다");
				break;				
			}
			
		}//System.out.print("1에서 "+su+"까지의 합은"+sum+"이다");
		// 여기에하면 for문 내의 출력값이 나오지 않는다.?? 나오는데 확인하기
		

//		for(int i=1;;i++){
			
//		}
		

	}
}

/*
임의수를 입력받아
1부터 합을 구하는데 합이 입력받은 값을 최초로 초과하는 시점의 수와 합을 구하라.


1+2+3+4+5+....

실행
임의의 수=253254
1에서 ___까지의 합은 ___ 이다.


*/