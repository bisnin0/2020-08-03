import java.util.Scanner;
class IfElseEx01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴(1.사각형의 넓이, 2는 원의 넓이) = ");
		int data = scan.nextInt();
		int result = 0;
		if (data==1) //1
		{
			System.out.print("밑변 = ");
			int a = scan.nextInt();
			System.out.print("높이 = ");		
			int b = scan.nextInt();
			result = a*b;
			System.out.print("사각형의 넓이는 "+ result+"입니다.");
				
		}else{  //1이외의 값
			if(data==2){ //2를 선택했을때
				System.out.print("반지름 = ");
				double a = scan.nextDouble();
				double b = 3.14;
				//double result2 = a*a*b;
				double result2 = a*a*Math.PI;
					//Math.PI = 원주율

				System.out.print("원의 넓이는 "+ result2+"입니다.");	
			
			}else{ //1,2를 제외한 메뉴일때..
				System.out.println("메뉴를 잘못 선택하였습니다..");

			
			}
			
			
			
			
		
		}
		
		
			

	}
}


/*
실행
메뉴(1:사각형의 넓이, 2는 원의 넓이)-> 1
밑변 = 
높이 = 
사각형의 넓이는 ____입니다.

메뉴(1:사각형의 넓이, 2는 원의 넓이)-> 2
반지름 = 
원의 넓이는 ____입니다.



*/