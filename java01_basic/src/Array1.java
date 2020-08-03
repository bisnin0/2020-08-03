class Array1 
{
	public static void main(String[] args) 
	{
		//배열이란 같은 데이터형의 변수가 여러개 필요할 때 생성한다.
		//배열로 선언된 각각의 변수는 index를 이용하여 접근할 수 있다.

		//배열선언방법
		// ex)정수형 10개를 저장할 공간이 필요하다.
		// int[] num [or] int num[] 
		int num[] = new int[10]; //10개의 변수가 0으로 초기값을 가짐
		//10개의 변수가 만들어짐.

		//여기에서 2번째 변수에 데이터를 지정하려면
		num[1] = 90; //0,1,2,3,4,5,6,7,8,9 이렇게 10개
		
		double num2[] = new double[5]; //0.0으로 초기값을 가짐

		String name[] = new String[10]; // null로 초기상태

		num[3] = 100;
		num[7] = 80;


		//합계를 구하려면 반복문 들어가기 전에 합계를 구할변수가있어야한다.
		int sum=0;

		//0,1,2,3,4,5,6,7,8,9 로 index를 가지고 있기 때문에
		for(int idx=0; idx<=9; idx++){//1,2,3,4,5,6,7,8,9
		// 배열의 길이 = 변수의 갯수 : num.length
		// 변수 갯수를 직접 쓰지 않고 길이 자체를 넣어주면 간단하지만 갯수를 구하는 거기 때문에
		// 0부터 시작하지 않고 1부터 시작한다. 
		// 그러므로 부호를 < num.length로 하거나 <=num.length-2로 해야한다.
		// 만약 합계를 구하려고 마지막 배열 숫자를 하나 추가했다면
		// < num.length -1
		// <= num.length -2
		// 이렇게 써줘야한다.
		// for(int idx=0; idx<= num.length; idx++)
			sum += num[idx];
			System.out.println("num["+idx+"]="+num[idx]);
		}
		
		System.out.println("sum="+sum);

/*
		//합계를 구할때 변수를 따로 선언하지 않고
		//11번째 배열을 만들고 거기에 값을 다 합해도 상관없다.

		int num[] = new int[11];
		
		for(int idx=0; idx<=9; idx++){//1,2,3,4,5,6,7,8,9
			num[10] += num[idx];
			System.out.println("num["+idx+"]="+num[idx]);
		}
		System.out.println("sum="+num[10]);
*/



	}
}
