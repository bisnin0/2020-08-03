class WhileTest2
{
	public static void main(String[] args) 
	{
/*		
		int cnt = 1;
		while(true){

			while(cnt<=5){
				int a=1;
				System.out.print(a);
				a++;
				cnt++;
			}System.out.println();
		if(cnt==5){
			break;
		}
		}
*/ //못푼거

		int row = 1;
		while(row<=5){//줄 1

			int col=1;
			while(col<=5){
				System.out.print(col);
				col++;
			}System.out.println();
			row++;
		}
		System.out.println("The End.....");



//while문은 조건이 false이면 한번도 실행이 안되지만
//do while문은 조건이 false이라도 한번은 실행된다.
	}
}
/*
12345
12345
12345
12345
12345
*/