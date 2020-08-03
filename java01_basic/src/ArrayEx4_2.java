import java.util.Scanner;
class ArrayEx4_2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String title[] = {"이름","국어","영어","수학","총점","평균","석차"};

		//학생수를 입력받아 이름 저장할 배열, 성적 저장할 배열 생성
		System.out.print("학생수 = ");
		int cnt = scan.nextInt();

		String names[] = new String[cnt];//이름 저장할 배열
		double jumsu[][] = new double[cnt+2][6]; //점수를 저장할 배열

		//데이터 입력
		for(int i=0; i<cnt; i++){// i=0,1,2,3,4 -> 학생수만큼 회전
			System.out.print(title[0]+"=");//이름
			scan.nextLine();  // nextLine 에러나서 초기화 한번 해줌
			names[i] = scan.nextLine();  // nextLine 확인
			//세과목의 점수
			for(int j=0; j<3; j++){ //j= 0,1,2
				System.out.print(title[j+1]+"=");
				jumsu[i][j] = scan.nextInt();
				
			}
		}
		//개인별 총점, 평균, 과목별 총점 
		for(int r=0; r<cnt; r++){//0,1,2,3,4
			for(int c=0; c<3; c++){//0,1,2
				jumsu[r][3] = jumsu[r][3] + jumsu[r][c]; //개인별 총점
				jumsu[cnt][c] = jumsu[cnt][c] + jumsu[r][c]; //과목별 총점
			}
			jumsu[r][4] = jumsu[r][3] / 3; //개인별 평균
		}

		//과목별 평균
		for(int c=0; c<=2; c++){ //0,1,2
			jumsu[cnt+1][c]= jumsu[cnt][c] / cnt;
			
		}

		//석차 구하기 : 자신의 점수보다 높은사람의 수를 구한다. 그 수만큼 +1하면 내 등수가 된다.
		for(int r=0; r<cnt; r++){ //0,1,2,3,4
			for(int r2=0; r2<cnt; r2++){ //0,1,2,3,4
				//		내총점		상대총점
				if(jumsu[r][3] < jumsu[r2][3]){ //내점수보다 상대가 크냐? 크면 등수 1증가
					jumsu[r][5]++;				//이미 배열 안에 0이라는 초기값이 있기때문에 +1만하면 1이올라간다.
					
				}
					
				}			
				jumsu[r][5]++; //내점수
		}
		

		//출력
		for(String t: title){//제목출력   확장된 for문 확인하기
			System.out.print(t+"\t");
		}
		System.out.println();
		//이름과 점수 출력
		for(int i=0; i<jumsu.length; i++){//0,1,2,3,4,5,6
			if(i==cnt){
				System.out.print("총점\t");
			}else if(i==cnt+1){
				System.out.print("평균\t");
			}else{
			System.out.print(names[i]+"\t");//이름				
			}

			for(int j=0; j<jumsu[i].length; j++){
				System.out.printf("%.1f\t", jumsu[i][j]); //점수. 소수점 1자리까지만 하겠다.
			}
			System.out.println();
			

			
		}
	}
}
