class ArrayEx1 
{
	public static void main(String[] args) 
	{
		int numArr[] = new int[102]; //index가 0부터 101까지 만들어진다.
		//난수를 생성하여 배열에 추가, index 100의 위치에 난수 누적
		for(int idx=0; idx<numArr.length-2; idx++){ // -2의 이유 = 100번재와 101번째는 합계와 평균을 저장할 공간으로 쓸거다.

			numArr[idx] = (int)(Math.random()*1000)+1; //1~1000

			numArr[numArr.length - 2] += numArr[idx];	
			//숫자는 102개인데 idx는 0부터101까지니까 idx로 대입하려면 100번째여야 맞으니102 -2

		}
		numArr[numArr.length - 1] = numArr[numArr.length - 2] / (numArr.length-2); //평균
		
		for(int i=0; i<numArr.length; i++){ //0~101
			if(i==numArr.length-2){
				System.out.println("\n합계="+numArr[i]);
			}else if(i==numArr.length-1){
				System.out.println("\n평균="+numArr[i]);			
			}else{
			System.out.print(numArr[i]+"\t");
			}
		}
/* 내가푼거
		int[] arr = new int[100];
		
		int sum = 0;

		for(int idx=0 ; idx< arr.length; idx++){
			double ran = Math.random();
			int ran2 = (int)(ran*1000)+1;
			arr[idx] = ran2;
			sum += arr[idx];
			System.out.print(arr[idx]+"\t");
				if((idx+1)%5==0){
					System.out.println();				
				}
		}System.out.println();
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+sum/100);
*/
	}
}

/*
배열에 난수(1~1000)사이의 값을 100개 저장하고
배열의 값을 합계와 평균을 구하라.

실행
1	34 4343 343

..
..

합계 = ____
평균 = ____

*/
