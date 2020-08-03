class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum = 0; //지역변수일때 자바는 초기값이 없으면 null이다. 에러. 반드시 초기화 해야한다.
		// i를 for문 밖에서 쓰고 싶으면 여기에 int i =0; 선언 하고 for문 앞에 i=1 써준다

		 int i=0;
		 for(i=1;i<=100;i++){
//		for(int i=1;i<=100;i++){
			sum += i;			
		}		
		System.out.println(sum);
		System.out.println("1~"+(i-1)+"까지의 합은 "+sum);
		//이렇게 쓸때 i는 for문을 나오며 i++로 인해 101이 되기때문에 -1해줘야함
		// (i-1)
	}
}



/*
1~100까지 합은 얼마? 5050


*/