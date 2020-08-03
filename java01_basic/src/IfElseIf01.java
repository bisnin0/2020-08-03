import java.util.Scanner;
class IfElseIf01 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 = ");
		int a = scan.nextInt();
		System.out.print("영어 = ");
		int b = scan.nextInt();
		System.out.print("수학 = ");
		int c = scan.nextInt();
		
		double total = a+b+c;
		double ave = total/3;
		char grade;
		if(ave>=90 && 100>=ave){
			grade = 'A';
		}else if(ave>=80 && ave<90){
			grade = 'B';
		}else if(ave>=70 && ave<80){
			grade = 'C';
		}else if(ave>=60 && ave<70){
			grade = 'D';
		}else if(ave>=0 && ave<60){
			grade = 'F';		
		}else{
			grade = 'X';
		}
		//여기서 else가 없으면 오류가 난다.
		//char grade 값을 넣지 않은 상태인데 else가 없으면 값도 없이 출력하라고 하는 경우가 생김
		//else 를 넣지 않으려면 grade에 초기값을 넣으면 된다. char grade='X';



		//출력
		if(grade!='X'){
			System.out.printf("총점=%f\n평균=%f\n학점=%s", total, ave, grade);
		}else{
			System.out.println("점수를 잘못입력하였습니다.");
		}


//		System.out.println("총점 = " + total);
//		System.out.println("평균 = " + ave);
//		System.out.println("학점 = " + grade);

	}
}

/*
3과목의 점수를 입력받아 총점, 평균(실수), 학점(실수)을 출력하라.
90~100 A
80~89 B
70~79 C
60~69 D
0~59 F
실행
국어=
영어=
수학=
총점=
평균=
학점=
*/

/*
	if~elseif문

	if(조건식){
		실행문;
	
	}else if(조건식){
		실행문;
	
	}else if(조건식){
		실행문;
	
	}else(조건식){//그외 처리
		실행문;
		
	} // if의 괄호 여기까지 한문장. 중간에 조건 만족되면 그 밑의 elseif들은 더 실행하지 않음


*/

