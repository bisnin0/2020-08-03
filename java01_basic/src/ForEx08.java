import java.util.Scanner;
class ForEx08 
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		System.out.print("홀수입력 = ");
		int data = scan.nextInt();
		
		String msg = " ";
		char al = 'A';		

		int step=2;  //밖에 변수 설정
		for(int i=1; i>=1; i+=step){ //1, 3, 5, 7, 9, 11, 9, 7, 5, 3,1

			for(int j=1; j<=(data-i)/2 ; j++){
				System.out.print(msg);
			}
			for(int k=1; k<=i; k+=1){
				System.out.print(al++);
				if(al>'Z')al='A';

			}
			System.out.println();	
			if(i>=data) step=-2;
		}
		
	}
}





/*
실행
홀수입력 = 11
		
		  A
		 BCD
		EFGHI
	   JKLMNOP
	  QRSTUVWXY
     ZABCDEFGHIJ   //11개
  	  KLMNOPQRS
	   TUVWXYZ
	    ABCED
		 FGH
		  I



*/
