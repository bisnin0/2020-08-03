import java.util.Scanner;
class ForEx04 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 = ");
		int max = scan.nextInt();
		int i=0, sum=0, oddsum=0, evensum=0; // 한번에 정의하는게 깔끔하다.
		for(i=1;i<=max;i++){ //1,2,3,4,....max
			sum += i; //전체합
			if(i%2!=0){
				oddsum +=i;
			}else{
				evensum +=i;
			}
			
		} 
		System.out.println("1~"+max+"까지의 합은"+sum);
		System.out.println("1~"+max+"까지의 홀수의 합은"+oddsum);
		System.out.println("1~"+max+"까지의 짝수의 합은"+evensum);

	}
}


/*
어떤수(정수)를 입력받아
입력받은 수까지 짝수의 합, 홀수의 합, 전체합을 구하여라.

실행
수입력 = 100
1~100까지의 합은 5050
1~100까지의 홀수의 합은 2500
1~100까지의 짝수의 합은 2550

*/