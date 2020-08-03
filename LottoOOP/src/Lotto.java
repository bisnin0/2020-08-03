import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random(); //임폴트 필요
	
	int lottoNum[] = new int[7]; //번호
	int gameCount;  //게임 수 

	public Lotto() {
		
	}
	
	//게임 수 입력
	public void getGameCount() {
		System.out.print("게임수=");
		gameCount = scan.nextInt();  //멤버변수에 넣는거라 리턴 안해줘도된다.
	} 
	
	
	//종료 여부 확인. 마지막인지 확인하는것.
	public String getEndQna() {  //리턴으로 해볼것. 글자라 String
		
		System.out.println("계속하시겠습니까?(Y:예, N:아니오)");
		return scan.nextLine(); //이렇게 쓰면 에러날 수 있어서 초기화 작업을 한번 해준다.
	}
	
	//번호+보너스 번호를 생성하여 배열에 추가
	public void createLotto() {
		//54, 32, 2, 54, 6, 4를 만들었다 치면 이 번호가 lottoNum[]에 들어간다. 
		// 문제는 입력한 번호가 멤버변수에 그대로 남아있게된다. 이렇게 연속으로 사용할때는 이전 번호를 지워줘야한다.
		lottoNum = new int[7]; //새로운 로또번호 생성전 이전번호들을 지운다.
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = ran.nextInt(45)+1; //i번째에 숫자를 넣는다.
			i = lottoCheck(i); //중복검사는 아래에서 할거다.
			// 아래에서 i를 받아서 변수i에 넣어줘야 하니까 i=lottoCheck(i);
		}
	}
	
	
	//중복검사(메소드 따로할거)
	public int lottoCheck(int i) {//i를 전달받는다. i가 4라면
		for(int j=0; j<i; j++) {               //j는0~3
			if(lottoNum[j] ==  lottoNum[i]) {
				return --i; //하면 되는데 이걸 리턴을 해줘야한다.
			}
		}
		return i; //똑같은값이 나오면 하나 줄여서 i를 리턴해주고 아니면 그냥 i를 리턴해준다.
	}
	
	

	//정렬은 Arrays에 있는 기능을 이용. sort(static이라 객체 안만들고 쓸 수 있는 클래스)

	
	
	//출력
	public void lottoPrint(int cnt) {
		//정렬하기  - 보너스를 제외한 정렬
		Arrays.sort(lottoNum,0, 6); //배열 lottoNum의 0부터 5까지 정렬 (마지막은 보너스라 안함)
		//6인 이유는 6앞까지 구하기 때문에 0~5가되는거다.
		System.out.print(cnt+"게임=");
		
		System.out.print(Arrays.toString(Arrays.copyOfRange(lottoNum,0,6)));
		//복사를 해서 문자열로 바꾸어 출력.
		
		System.out.print(", bonus="+lottoNum[6]);
		System.out.println();
	}
	
	public void lottoCreateStrat() { //전체적으로 실행하는 메소드
		
		//라벨 break;로 특정 반복문을 지정하여 중단시킬때
		a:    //라벨 이렇게 설정하면 a: do ~ while 00000000 가 중단된다.
		do {
			getGameCount(); //게임수
			for(int i=1; i<=gameCount; i++) { //게임수 만큼 생성
				createLotto(); //중복검사
				lottoPrint(i); //출력  cnt숫자 증가 i가 1일때 cnt도 1
				
			}
			//계속여부 확인 Y는 계속하고 N은 종료하고 그 외에는 다시질문
			scan.nextLine(); //에러 대비 초기화 27행에 있는것.
			do {
				String qna = getEndQna();  //호출
				if(qna.equalsIgnoreCase("Y")) {
					break; //가장 가까운 반복문이 끝난다. 여기서 브레이크가 걸리면 아래 00000000으로 간다.
				}else if(qna.equalsIgnoreCase("N")) {
					break a; //라벨 a 종료
				} // 이 두가지 조건을 못만나면 반복문이니 위로 돌아가서 질문 다시한다.
			}while(true); //y일때 이 반복문을 끝내면 아래로 내려가서 다시 저 위로 올라간다.
		}while(true);  ///00000000
		System.out.println("프로그램이 종료되었습니다.."); //라벨 a가 종료되면 여기로 온다.
	}
	
}



/* 숙제 풀이
Scanner, 배열 필요

*/