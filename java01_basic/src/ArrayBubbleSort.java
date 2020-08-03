class ArrayBubbleSort 
{
	public static void main(String[] args) 
	{
		int data[] = new int[10];
		

		for(int i=0; i<data.length; i++){
			data[i] = (int)(Math.random()*100)+1;
		}//for
		System.out.println("========정렬전========");
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+"\t");
		}//for
		
		//정렬 한번
		for(int i=0;i<data.length-1;i++){//0,1,2,3....8 왼쪽값이 기준이라서.
			if(data[i] > data[i+1]){
				//교환				
				int temp = data[i];
				data[i]= data[i+1];
				data[i+1] = temp;

			}
									
		} 
		System.out.println("\n=============정렬후=============");
		for(int t: data){
			System.out.print(t+"\t");
		}
		System.out.println();
		System.out.println();
		System.out.println();
/*
		//정렬 반복
		for(int j=0; j<data.length; j++){
			for(int i=0;i<data.length-1;i++){//0,1,2,3....8 왼쪽값이 기준이라서.
				if(data[i] > data[i+1]){
					//교환				
					int temp = data[i];
					data[i]= data[i+1];
					data[i+1] = temp;

				}
										
			} 
		
			System.out.println("\n=============정렬후2=============");
			for(int t: data){
				System.out.print(t+"\t");	
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();
*/
		//정렬 반복 회전 수 줄이기
		for(int j=0; j<data.length-1; j++){
			//        0  < 9  : 1~8
			//        0  < 8  : 1~7
			for(int i=0;i<data.length-1-j;i++){//0,1,2,3....8 왼쪽값이 기준이라서.
				if(data[i] > data[i+1]){
					//교환				
					int temp = data[i];
					data[i]= data[i+1];
					data[i+1] = temp;

				}
										
			} 
		
			System.out.println("\n=============정렬후3=============");
			for(int t: data){
				System.out.print(t+"\t");	
			}
		}



	}	
}
