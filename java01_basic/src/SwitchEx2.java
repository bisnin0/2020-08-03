import java.util.Scanner;
class SwitchEx2 
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

		int total = a+b+c;
		double ave = total / 3;
		String grade ="";
		double d = ave*0.1; 
		//int d = (int)(ave/10);
		//switch(d)
		if(ave>=0 && ave<=100){
			switch((int)d){
				case 10: 
				case 9:
					grade="A";
					break;
				case 8:
					grade="B";
					break;
				case 7:
					grade="C";
					break;
				case 6:
					grade="D";
					break;
				default:
					grade="F";		
				}
				

			}
			System.out.printf("총점=%d\n평균=%f\n학점=%s\n", total, ave, grade);

			
/*



*/




	}
}

/*
3과목의 점수를 입력받아 총점, 평균(실수), 학점(실수)을 출력하라.
90~100 A
80~89 B
70~79 C
60~69 D
0~59 F
실행 학점은 switch로 구한다.

국어=
영어=
수학=
총점=
평균=
학점=
*/
