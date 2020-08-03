package javaAPI;
import java.util.Random;
class RandomTest2 
{
	public static void main(String[] args) 
	{
		// Random클래스를 이용한 난수 만들기
		Random ran = new Random();
		for(int i=1; i<=500; i++){
		// int 데이터범위내의 임의의 수
//			int ranInt = ran.nextInt(); //int형 정수를 생성하여준다. , nextLong()
		// 실수형 nextDouble(), nextFloat()
		// 논리형 nextBoolean()
		
		//0~99, 0~49
		int ranInt = ran.nextInt(50);
		//51~100, (int)(큰수-작은수+1)+작은수 <--여기서 작은 수 더하는 위치 주의
		ranInt = ran.nextInt(50) + 51;
//			boolean ranInt = ran.nextBoolean();

//			double ranInt = ran.nextDouble();
			System.out.print(ranInt+"\t");
		}
	}
}
