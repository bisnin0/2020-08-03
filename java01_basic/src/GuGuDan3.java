class GuGuDan3 
{
	public static void main(String[] args) 
	{
		System.out.println("\t=구구단=");


		for(int dan=1; dan<=9; dan+=3){ //1,4,7 
		
			//header
			for(int i=dan; i<dan+3; i++){ //1,2,3   4,5,6   7,8,9
				System.out.print("="+i+"=\t");

			} 
			System.out.println();
			//구구단
			for(int j=2; j<=9; j++){//2,3,4,5,6,7,8,9
				for(int i=dan; i<dan+3; i++){ //1,2,3	 4,5,6		7,8,9
			//구조를 이해 : 2~9단까지 3번씩 하면서 간다.

					int result = i*j;
					System.out.print(i+"*"+j+"="+result+"\t");
			} 
			System.out.println();

			}
		}
	}
}
