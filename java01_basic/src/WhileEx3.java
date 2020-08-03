class WhileEx3
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i<=9){

			int sum = 0;
			int k = 1;	
			while(k<=9){
				sum +=i;
				System.out.print(sum+"\t");
				k++;
			}System.out.println();
			i++;

		}


	}
}
