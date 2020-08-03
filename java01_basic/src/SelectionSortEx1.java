class SelectionSortEx1 
{
	public static void main(String[] args) 
	{
		int a[] = new int[10];

		for(int i=0; i<a.length; i++){
			a[i]=(int)(Math.random()*100)+1;
			System.out.print(a[i]+" ");

		}System.out.println();

		for(int i=0;i<a.length-1;i++){
			int idx = i;
			int min = a[i];
			for(int j=i+1;j<a.length; j++){
				if(a[j]>min){
					min=a[j];
					idx = j;
				}
			} 
			int temp = a[i];
			a[i] = a[idx];
			a[idx] = temp;
			for(int j=0; j<a.length; j++){
				System.out.print(a[j] + " ");
			}
			System.out.println();


		}
			
	}
}
