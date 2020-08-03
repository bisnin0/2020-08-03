class WhileTest1 
{
	public static void main(String[] args) 
	{
		//while문으로 5바뀌 돌리기 1,2,3,4,5

//		int i=1;  //////
//		while(i<=5){
//			System.out.println(i);
//			i+=1; //i++, i=i+1, ++i
//		}
//		System.out.println("The End....");
	
		int i=0;     ///0으로 바꾸면
		while(i<5){
			i+=1;
			System.out.println(i);
			
		}
		System.out.println("The End....");
	}
}


/*
while : 반복문 조건식이 참일때 반복실행한다.

while(조건식){
		//조건식이 참일때 실행문을 실행한다.
		실행문;
		실행문;

}

while(true){
이건 항상 참이라 실행문이 계속 돌아간다. 이게 더 유리할때도 있음

}
*/