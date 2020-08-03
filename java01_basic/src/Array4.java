class Array4 
{
	public static void main(String[] args) 
	{
		//배열의 복사

		//배열은 생성 후 배열의 크기를 변경할 수 없다.

		int arr[] = {56, 15, 78, 69, 86, 42, 99}; //0~6  7개
		
		//arr의 값을 arr2에 복사하는방법

		int arr2[] = new int[20]; 

		//----arraycopy?(Object src, int srcPos, Object dest, int destPos, int length)----
		//				원본배열	  , 복사시작 index, 타겟배열명   , 시작위치		, 갯수
		System.arraycopy(arr, 2, arr2, 0, 4 ); //arr배열의 78부터 arr2에 복사해서 넣는다. arr2의 0번 위치부터 4개를
		for(int i=0; i<arr2.length; i++){
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("=================================");
		
		//확장된 for문
		//	배열의 데이터타입 변수 : 배열명
		for( int data	 	: arr ){
			System.out.println(data);
			
		}//for

	}
}
