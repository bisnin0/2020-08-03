package javaAPI;

public class MathTest {

	public MathTest() {
	}

	public static void main(String[] args) {
		System.out.println("abs="+Math.abs(-9)); //절대값 구하는 식이라 9넣으면 그냥 9.. -를 넣어야함
							//		절대치
		
		// ceil() : 올림  // 무조건 큰 수
		
		//floor() : 내림  // 무조건 버림
	
		//round() : 반올림
		
		System.out.println("ceil="+Math.ceil(10.1)); //11이 나옴.. 올림이니까 실수를 넣어서 확인
		System.out.println("ceil="+Math.ceil(-10.1)); //10이 나옴..
		System.out.println("ceil="+Math.ceil(-10.9)); //10이 나옴..
		
		
		System.out.println("floor="+Math.floor(10.1)); //10이 나옴 .. 소수 이하 무조건 버린다.
		
		System.out.println("round="+Math.round(10.4)); //10 반올림
		System.out.println("round="+Math.round(10.7)); //11 반올림
		
		///////////////
		int a=90, b=20;
		System.out.println("max="+Math.max(a, b));  //둘중에 큰 값을 구하는것.
		System.out.println("min="+Math.min(a, b));  //둘중에 작은값을 구하는것
		
		
		// pow() : 7의 9승(7을 9번 곱)을 구할때 for문을 썼지만 pow가 그 기능을 해줌.
		//   	      값을 2개를 주고 7을 앞에 9를 뒤에
		
		System.out.println("pow="+Math.pow(7, 9)); //더블로 포현된다. 7의 9승 너무 커서 정수로는 표현이 안되는 값이라 이상하게 출력됨
												   //여기서 나오는 E는 지수. 4.0~E7은 4.0~의 7승이라는말
		int powInt = (int)Math.pow(7, 9); //더블이어서 수가 작게나오니까 인트로 형변환하면 제대로 나옴
		System.out.println("pow="+Math.pow(7, 9)+"-->"+powInt); 
		
		System.out.println("pow="+Math.pow(7, 3)); //7의 3승
		
		// sqrt() : 루트
		System.out.println("sqrt="+Math.sqrt(10)); //루트 구하는것
		
		
	
	}

}
