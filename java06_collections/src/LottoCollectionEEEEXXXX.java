import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollectionEEEEXXXX {
	Scanner scan = new Scanner(System.in);

	public LottoCollectionEEEEXXXX() {

	}
	
	//콘솔에서 문자열 입력
	public String conInput(String msg) {
		System.out.println(msg+"=");
		return scan.nextLine();
	}
	
	
	
	//1게임 생성 : 중복검사, 정렬
	public void createLotto(int cnt) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		do {
			int lotto = (int)(Math.random()*45)+1; //마지막으로 생성한 번호
			ts.add(lotto);
			if(ts.size()>=7) {  // ts에 7개의 번호가 있음
				ts.remove(lotto);//마지막 생성된 번호 지우기
				lottoNumPrint(ts, lotto, cnt);
				break;
			}
			
		}while(true);
	}

	//출력
	public void lottoNumPrint(TreeSet<Integer> ts, int lotto, int cnt) { //이 값을 넘겨받는다.
		System.out.print(cnt + "게임 = ");
		System.out.print(ts.toString());
		System.out.println(", bonus = "+lotto);
	}
	
	//생성 시작
	public void createStart() {
		do {
			try {
			//게임 수 입력
				int gameCnt = Integer.parseInt(conInput("게임수")); //conInput은 String.. 이걸 int로 바꿔야한다. Integer.Valuof나 ParseInt
				for(int i=1; i<=gameCnt; i++) {					  //숫자문자가 아닌걸 입력했을때 예외처리
					createLotto(i);
				}
				
				//계소경부
				do {
					String qna = conInput("계속하시겠습니까?(Y:예, N:아니오)");
					if(qna.equalsIgnoreCase("Y")) {//Y
						break;
					}else if(qna.equalsIgnoreCase("N")) {//N
						//프로그램 종료
					System.out.println("프로그램이 종료되었습니다.");
					System.exit(0);  //무슨일이 있던 상관없이 여기서 자바 가상머신을 종료시킨다. System.exit(아무숫자);
					}
				}while(true);
				
			}catch(NumberFormatException nfe) {				 
				System.out.println("양의 정수를 입력하세요...");
			}	
			
		}while(true);
		
		
	}

	public static void main(String[] args) {
		new LottoCollectionEEEEXXXX().createStart();

	}

}
