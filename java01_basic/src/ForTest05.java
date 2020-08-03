class ForTest05
{
	public static void main(String[] args) 
	{
		// break : 반복문 종료
		// continue : 반복문 한번 건너 뛰기
		int sum = 0;
		for(int i=1; i<=1000; i++){
			sum += i;
			if(sum>1000){
				System.out.println(i+"-->"+ sum);
//				break;
				continue;
				
			}
			System.out.println("aaaaaaaaa");  //왜 뒤에 안찍히는지 확인
		}
		System.out.println("end...");
	}
}

/*
break; 반복문 종료
continue; -> 한번 건너뛴다.
for(i=1;i<=1000;i++){
//	break; // 그냥 반복문을 끝내라.
	if(i==100){
//		break; //i가 100일때 반복문을 중단하고 1000까지 구하지 말아라.
		continue; //i가 100일때 건너뛰고 101부터 반복문을 실행해라.
	}



}

*/