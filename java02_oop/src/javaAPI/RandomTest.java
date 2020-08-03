package javaAPI;
class RandomTest 
{
	public static void main(String[] args) 
	{
		// 난수 생성
		// 0.0~1.0 사이의 값을 생성해준다.
		// java.lang 안에 있으니 import안해줘도된다.
/*
		double ran = Math.random();
		System.out.println(ran);

// Scanner. 이 안되는 이유
// API 에서 볼때 static이 붙은 것들은 Math.PI 식으로 .이붙음
// Scanner나 String에 보면 static이 안붙은것들이 있는데 이런것들은 .을 안쓴다.

		int ranInt =(int)(ran*100);
		System.out.println(ranInt);
*/

		for(int i=1; i<=1000; i++){
			double ran = Math.random();
//			int ranInt =(int)(ran*100); //100을 곱하면 0~99까지 100개, 50을 곱하면 0~49까지만 50개
			//1~100사이를 만들고 싶다면
//			int ranInt =(int)(ran*(100-1+1))+1; //1~100사이를 만들고 싶다면 (정수)(난수*(큰수-작은수+1)) +작은수
			//51~100까지 만들고 싶다면
			int ranInt =(int)(ran*(100-51+1))+51;
			System.out.print(ranInt+"\t");
		}

	}
}
