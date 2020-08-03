class Array3 
{
	public static void main(String[] args) 
	{
		System.out.println(args);
		//args : arguments - 매개변수, 파라미터 (args :그냥 변수 이름)
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

	
// 아이디가 admin이고 비밀번호 1234 아니면 실행 안되게 만드는법
//	
		
		//id:admin, password:1234
//	 XXXif(args[0]=="admin"){ // ==비교연산자는 기본데이터 타입을 비교할때 사용. 클래스는 비교를 제대로 못한다.
		if("admin".equals(args[0]) && "1234".equals(args[1])){ 
			//admin과 args[0]을 비교해서 같으면 true 다르면 false
			//순서를 바꿔서 args[0].equals("admin") && args[1].equals("1234")해도 괜찮음
			int sum = 0;
			for(int i=1; i<=100; i++){
				sum += i;
			}
			System.out.println("1~100까지의합은"+sum);

		}else{//로그인 실패시 실행하는 실행문
			System.out.println("아이디와 비밀번호를 잘못 입력하였습니다.");
		}
			
	
	}
}
 