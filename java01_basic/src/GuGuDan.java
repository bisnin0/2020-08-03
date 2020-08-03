class GuGuDan
{
	public static void main(String[] args) 
	{
		int a = 1;

		for(int i=1 ; i<=2 ; i++){  //구구단
			System.out.print("\t");
		}System.out.println("=구구단=");

		for(int i=1 ; i<=3 ; i++){ // 단 이름
			System.out.printf("  =%d단= \t", i);
		}System.out.println();

		for(int i=2 ; i<=9 ; i++){ //1~3단까지
			System.out.printf("%d*%d = %d \t", a, i, a*i);
			System.out.printf("%d*%d = %d \t", a+1, i, (a+1)*i);
			System.out.printf("%d*%d = %d \t", a+2, i, (a+2)*i);
			System.out.println();	

		}System.out.println();
		a += 3;

		for(int i=4 ; i<=6 ; i++){  // 단 이름
			System.out.printf("  =%d단= \t", i);
		}System.out.println();
		
		for(int i=2 ; i<=9 ; i++){ //3~6단까지
			System.out.printf("%d*%d = %d \t", a, i, a*i);
			System.out.printf("%d*%d = %d \t", a+1, i, (a+1)*i);
			System.out.printf("%d*%d = %d \t", a+2, i, (a+2)*i);
			System.out.println();
		}System.out.println();
		a += 3;

		for(int i=7 ; i<=9 ; i++){ // 단 이름
			System.out.printf("  =%d단= \t", i);
		}System.out.println();

		for(int i=2 ; i<=9 ; i++){ //6~9단까지
			System.out.printf("%d*%d = %d \t", a, i, a*i);
			System.out.printf("%d*%d = %d \t", a+1, i, (a+1)*i);
			System.out.printf("%d*%d = %d \t", a+2, i, (a+2)*i);
			System.out.println();
		}System.out.println();
		a += 3;

	


	}
}


/*
		=구구단=
=1단=	=2단=	=3단=
1*2=2	2*2=4	3*2=6
1*3=3	2*3=6	3*3=9
:		:		:

=4단=	=5단=	=6단=
4*2=8	5*2=10	6*2=12
4*3=12	5*3=15	6*3=18
:		:		:

=7단=	=8단=	=9단=
7*2=14	8*2=16	9*2=18
7*3=21	8*3=24	9*3=27
:		:		:

*/
