import java.util.Scanner;
class IfTest01
{
	public static void main(String[] args) 
	{
		// 어떤수를 입력받아 0보다 클때만 출력하라.
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자입력=");
			double inData = scan.nextDouble(); // 콘솔의 문자를 입력받아 실수로 변경해주는 메소드
			
			if(inData>0){ //0보다 inData가 클때 실행
				System.out.println("inData="+inData);

			}
			System.out.println("end......");
			


	}
}


/*
제어문 : if문
조건식 : true, false 수식, 상수, 리터럴
      ---------------
if(조건식){ --> 조건식이 참일때 실행
	실행문;
	실행문;
	....
}
      --------------- 여기까지 한 문장
실행문; <-괄호를 벗어났기에 if문의 실행 여부와 관계없이 실행되는 위치


if(a+b는 잘못된 수식. a>b는 조건식에 해당. true, false에 해당해야함. 논리식){}
if(false){}

*/