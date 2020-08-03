class ForTest1
{
	public static void main(String[] args) 
	{
		//반복문
		//1~10까지 출력하는 프로그램 만들기
		for(int i=1; i<=10 ;i++){
			System.out.print("A");

		}

/*		for(int j=1;;j=j+10){
			System.out.println("Test->"+ j);
		} // 무한루프

*/
		System.out.println();
		//1~100가지 짝수만 출력
		for(int i=1 ; i<=100; i++){
			if(i%2==0)System.out.println(i);
		}

		for(int i=2; i<=100; i+=2){// i=i+2
			System.out.println(i);
		}
		
		for(int i=10;i>=1;--i){ //i--, --i, i=i=1, i-=1
			System.out.println("i="+i);
			
		}


	}
}

/*
	: 
		 초기값     최종값(조건식 true, false나오는 수식)  증가값
	for( int i=1 ;              i<=10          ;  i  ){
		// 이 초기값 i는 for문 괄호 안에서만 사용되고 벗어나면 없어진다.(지역변수)
		// 증가값은 i++, ++i, i=i+1, i+=1
		System.out.println(i);


	} // 초기값을 가지고 조건식 조건을 만족할때 괄호 안의 수식을 실행 후 처음으로 돌아가서 증가값을 실행 한 후 재시작.
	  // 반복하다 조건식을 만족하지 않게되면 for문이 끝나고 이곳으로 나온다.



실행
1
2
3
4
5
:
10





10
9
8
:
1

*/


