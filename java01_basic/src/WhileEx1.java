import java.util.Scanner;
class WhileEx1
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.print("임의의 수 = ");
		int data = scan.nextInt();
/*
		int sum = 0;
		int a = 0;
		while(sum<=data){
			a = a+1;
			sum=sum+a;
			}
*/
			
		
//////////

		int sum = 0;
		int a = 1;
		while(true){
			a = a+1;
			if(sum<=data){
				System.out.println("1에서 "+a+"까지의 합은"+sum+"이다");
				sum += a;
				break;

			}

		}

//		System.out.print("1에서 "+a+"까지의 합은"+sum"이다");
//		System.out.printf("1에서 %d까지의 합은 %d이다", a, sum);
	}
}
