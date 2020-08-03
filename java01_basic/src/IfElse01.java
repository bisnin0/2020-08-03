import java.util.Scanner;
class IfElse01
{
	public static void main(String[] args) 
	{
		// 정수를 입력받아 양수일때는 양수에 100을 곱하여 출력하고
		// 음수일때는 입력받은 값을 양수로 변경한다음 200을 곱하여 출력하라
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력=");
		int inData = scan.nextInt();
		

		int result = 0;
		if(inData<0){
			result = -inData*200;  //단항연산자 - 확인
			//int result = -inData*200;
			//if문 안에서 선언된 result는 if문 안에서만 사용가능하다.
			//상황따라 다르지만 외부에서 선언하고 들어오는게 결과값 출력하기 좋다.
			
		}else{//0, +
			result = inData*100;
						
		}
			System.out.print("result="+result);


		// result는 if문의 블럭을 벗어났기때문에 여기서부터는 못쓴다.
		// result를 사용하려면 if문 위에 선언해야한다.
/*
		int result=0;
		if(inData<0){
			int a=1234;
			result = -inData*200;  //단항연산자 - 확인
			System.out.print("result="+result);
			//if문 안에서 선언된 result는 if문 안에서만 사용가능하다.
			
		}else{//0, +
			int a=5678;
			//if문과 else문의 블럭이 다르기때문에 int a를 두번 선언해도 에러 안난다.
			
		}
		int result = 1234;
		//메인 블럭 내에 이미 result가 선언되었기때문에 에러가 발생한다.
*/
	}
}


/*
if(조건식){

	참

	내부에 if문이 또 들어갈 수 있다.
	}
	else{

	거짓

		}
	}
*/

/*
if(조건식){ //참일때
실행문;
....
}else{// 거짓일때
실행문;
....
}

*/