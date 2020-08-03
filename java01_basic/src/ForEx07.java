import java.util.Scanner;
class ForEx07 
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		System.out.print("홀수입력 = ");
		int data = scan.nextInt();
		
		String msg = " ";
		char al = 'A';		

		for(int i=1; i<=data; i+=2){

			for(int j=1; j<=(data-i)/2 ; j++){
				System.out.print(msg);
			}
			for(int k=1; k<=i; k+=1){
				System.out.print(al++);
				if(al>'Z')al='A';

			}System.out.println();	
		}

/* 내가하던거
		//역수로
		for(int i=1; i<=data-2; i+=1){
			//공백
			for(int j=1; j<=i; j+=1){
				System.out.print(msg);
			}
			for(int k=1; k<=(data-i)/2 ;k++){
				System.out.print(al++);
				if(al>'Z')al='A';
			}System.out.println();


			//문자
		}
*/		
		for(int i=data-2; i>=1; i-=2){ //9,7,5,3,1 이 조건을 잘 이해하기
			//공백
			for(int s=1; s<=(data-i)/2 ; s++){
				System.out.print(" ");
			}
			//문자
			for(int j=1; j<=i; j++){
				System.out.print(al++);
				if(al>'Z') al='A';
			}System.out.println();


		}
	}
		
	}
		
/*
//풀이
		Scanner scan = new Scanner(System.in);
		System.out.print("홀수입력 = ");
		int max = scan.nextInt();
		if(max%2==0){//짝수면 홀수로 변경
			max++;
		}
		char txt ='A';//출력할 데이터의 초기값

		for(int i=1; i<=max; i+=2){ //1,3,5,7,9, ... max 입력할 문자 수 계산식
			//공백
			for(int s=1; s<=(max-i)/2; s++){ //좌우라서 나누기2
				System.out.print(" ");
			}

			//문자

			for(int j=1; j<=i; j++) { //1
				System.out.print(txt++);
				if(txt>'Z') txt='A';
				
			}System.out.println();


//역수 풀이
		for(int i=max-2; i>=1; i-=2){ //9,7,5,3,1
			//공백
			for(int s=1; s<=(max-9)/2 ; s++){
				System.out.print(" ");
			}
			//문자
			for(int j=1; j<=i; j++){
				System.our.print(txt++);
				if(txt>'Z') txt='A';
			}


		}


		} 
		
*/

	
	



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
