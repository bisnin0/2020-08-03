class ForTest6
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5 ; i++){//5번
			for(int j=1; j<=5 ; j++){
//				System.out.print(i+"\t");//25번
//				System.out.print(j+"\t");
				System.out.print("*");
			}
			System.out.println(); //줄변경
		}

		/*
		*
		**
		***
		****
		*****


		
		*/
		System.out.println();


		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		*****
		****
		***
		**
		*
		*/
		System.out.println();


		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		    *
		   **
		  ***
	  	 ****
		*****

		*/

		String msg = " ";
		
		for(int i=1; i<=5; i++){ 
//			for(int j=1; j<=i; j++){ 틀린부분
				for(int k=4; k>=i; k--){
					System.out.print(msg);
					
				}	
				for(int j=1; j<=i; j++){
					System.out.print("*");
					}
				

//			}
				System.out.println();

		}
 //순서를 이이해하기

 //풀이 
 		for(int i=1; i<=5; i++){//1 2 3 4 5
			//공백
			for(int space=1; space<=5-i ; space++){
				System.out.print(" ");
			}
			//별
			for(int j=1; j<=i; j++){
				System.out.print("@");
			}
			System.out.println();
		}

		/*
		*****
		 ****
		  ***
		   **
		    *
		*/
		for(int i=1; i<=5; i++){
			for(int space=4; space>=i; space--){
			System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
			System.out.print("*");
			}
			
			System.out.println();

		}
// 잘못된 문제풀이. 확인





		for(int i=5; i>=1; i--){//5, 4, 3, 2, 1
			//공백
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
							
			} 

			//별
			for(int j=1; j<=i; j++){
				System.out.print("%");
			}
			System.out.println();
		}
		//풀이

		/*
		      *
			 ***
			*****
		   *******
		  *********
		*/
		int a = 5;
		for(int i=1; i<=10; i+=2){ 
				a = a- 1;
			//공백
			for(int s=1; s<=a; s++){
				System.out.print(" ");
			}
			//별
			for(int j=1; j<=i ; j++){
				System.out.print("*");
			} 
			System.out.println();
		}	
		
		//풀이
		
		for(int i=1; i<=9; i+=2){// 1,3,5,7,9
			//공백					//4,3,2,1,0
			for(int s=1; s<=(9-i)/2;s++){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("$");
			}
			System.out.println();
		}

		/*
		*********
		 *******
		  *****
		   ***
		    *
		개인적으로 해보기
		
		*/
					

	}
}

/*
중첩반복문 : 반복문내의 반복문

실행 
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5


*/
