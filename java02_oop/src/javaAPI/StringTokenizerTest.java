package javaAPI;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		start();
	}
	public void start() {
		String msg = "서울시,,,, 마포구, 백범로, ::::거구빌딩;;;;, 3층";
		StringTokenizer st = new StringTokenizer(msg, ","); //import 해줘야한다.
		//구분기호가 여러개면 한꺼번에 넣어준다.
		// StringTokenizer st = new StringTokenizer(msg, ":,;");
		
		int cnt = st.countTokens();
		System.out.println("cnt="+cnt);
		//(mag, " ") 이 문자열을 기준으로 몇개의 단어(토큰)가 있는지 구한다.
		//단어 한개 한개는 토큰이다.
		
		while(st.hasMoreTokens()) {//남은 토큰이 있는지 확인
			String token = st.nextToken();
			System.out.println("token="+token);
		}
	}
	//토큰 수 구하기
	
	
	
	
	public static void main(String[] args) {
		new StringTokenizerTest();
	}

}
