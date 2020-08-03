package javaAPI;

public class StringCompareTo {

	public StringCompareTo() {
		System.out.println("생성자....");
	}

	public void start() {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		//임폴트 하지 않고 바로 쓰는법. 거의 사용 안함
		
		//compareTo문자열의 크기 비교하기
		String str1 = new String("Best Java"); //74
		String str2 =			 "Best Design"; //68 앞에있는 문자부터 비교해나간다.
		
		
		// 음수=오른쪽에있는 변수가 클때,   0=같다. ,  양수=왼쪽에있는 변수가 클때
		int result1 = str1.compareTo(str2);
		int result2 = str2.compareTo(str1);
		
		System.out.println("result1="+result1);  //6   str1-str2
		System.out.println("result2="+result2);	 //-6  str2-str1
		//J = 아스키코드 74 D = 68 ... 74-68 : 6 ... 68-74 : -6
		//
		
		if (result1>0) {
			System.out.println("str1이 str2보다 크다.");
		}else if(result1<0) {
			System.out.println("str2가 str1보다 크다.");
		}else {
			System.out.println("str1과 str2는 같다.");
		}
		
		
	}
	
	public static void main(String[] args) {
		new StringCompareTo().start(); //변수에 넣지 않고 객체생성 하면서 바로 메소드 호출
	}

}
