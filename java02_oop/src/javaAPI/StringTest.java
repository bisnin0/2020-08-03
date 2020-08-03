package javaAPI;

public class StringTest {
	public StringTest() { //아래 new StringTest(); 으로 실행되는 생성자 메소드
		start(); // 밑에 start실행
	}  //생성자메소드
	public void start() { //그냥 메소드
		//String는 문자열과 관련된 기능
		String name;
		String name2 = new String();
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		if(name3 == name4){
			System.out.println("name3과 name4는 같다.");
		}else{
			System.out.println("name3과 name4는 다르다.");
						
		} // 객체를 ==로 같은지 확인 할때 저장되어있는 주소가 다르기때문에 무조건 다르다고나온다/ 
		
		//객체가 같은지 확인하기 위해서는 ==이 아니라 uquals()라는 메소드를 사용해야한다.
		if(name3.equals(name4)) { //name3랑 비교할객체 name4 
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		char c[] = {'J', 'A', 'B', 'A'};
		//이걸 한개의 문자열로 만들려면
		String cStr = new String(c); // cStr은 하나의 문자열이다.
		System.out.println("cStr="+cStr);
		
		String valueStr = String.valueOf(c); //이렇게도 된다.
		System.out.println("valueStr="+valueStr);
		
		int num = 1234;
		String numStr=String.valueOf(num);
		System.out.println("numStr="+numStr+100); //+100이 연결되어 나오면 문자열이란말
		
		String numStr2 = num+""; //이렇게해도 문자화가 되지만
		System.out.println("numStr2="+numStr2+100);//이렇게 하는게 바람직하다.
		
		//같은 이름을 가지고있는 메소드가 여러개인것 : *오버로딩*된 메소드 ex)valueof메소드
		//자바가상머신이 이름 똑같은걸 계속 로딩 해야 하니까
		
		
		//			   0123456789012345678901234 index
		String data = "Java Programing Test.....";
		char at = data.charAt(5); //5번째 index P를 at로 
		System.out.println("charAt="+ at);
		
		
		//문자열을 바이트 배열로 생성하여 리턴해준다. data(java Pro....)를 가지고 만들면
		byte dataArr[] = data.getBytes();
		for(int i=0; i<dataArr.length; i++) {
			System.out.println("dataArr["+i+"]="+dataArr[i]);
		}
		
		
		
		//특정 문자의 index 위치를 구하는것. 앞에서부터
		int idx = data.indexOf("g");
		System.out.println("indexOf="+idx);
		
		int idxLast = data.lastIndexOf("g"); //뒤에서부터
		System.out.println("lastIndexOf="+idxLast);
			
		//글자수
		int size = data.length();
		System.out.println("length="+size);
		
		
//		//			   0123456789012345678901234 index
//		String data = "Java Programing Test.....";
		data = data.replaceAll("Java", "자바"); //특정한 문자를 다른문자로 바꿔준다. 대소문자 똑같이 해야함 앞에는 기존문자, 뒤는 바꿀문자
		System.out.println("replaceAll="+data); // replaceAll로 바꾸면 이후로 data의 문자는 "자바 Programing Test....."로 변경된다.
		
		String tel = "010-1234--5678";
		String telSplit[] = tel.split("-"); // ("")안의 문자를 기준으로 쪼갠다. -를 기준으로 하니 --사이 비어있는것도 나눠진다. 
		for(int i=0; i<telSplit.length; i++) {
			System.out.println("telSplit["+i+"]="+telSplit[i]);
		}
			
		//				012345678901234
		String email = "abcdef@nate.com"; //아이디를 구하고싶다면 @위치를 먼저 구한다.
		int atMark = email.indexOf("@");// 6이 구해진다.
		//							   index 6 앞자리까지 구한다.
		String id = email.substring(0, atMark);
		System.out.println("id="+id);
		
		String domain = email.substring(atMark+1); //@다음부터 끝까지 구할때는 시작위치만 구해주면 된다. @다음이니 +1
		System.out.println("domain="+domain);
		
		//toLowerCase() : 소문자로 변경
		//toUpperCase() : 대문자로 변경
		String lower = data.toLowerCase();
		String upper = data.toUpperCase();
		System.out.println("toLowerCase="+lower);
		System.out.println("toUppwerCase="+upper);
		
		//
		String data2 = "      Java Spring Mybatis      "; //trim은 문자 앞 뒤로 있는 공백을 제거해준다.
		String trim = data2.trim();
		System.out.println("trim="+trim+"------");
		
		
		//equals() : 대소문자 구별하여 같은지 결과를 true, false로 구분해준다.
		//equalsIgnoreCase():대소문자를 구별하지 않고 같은지 결과를 구한다.
		
		String d1 = "Test Program";
		String d2 = "test program";
		if(d1.equals(d2)) {
			System.out.println("equals()=>d1과 d2는 같은 문자열 입니다.");
		}else {
			System.out.println("equals()=d1과 d2는 다른 문자열입니다.");
		}
		
		if(d1.equalsIgnoreCase(d2)) {
			System.out.println("equalsIgnoreCase()->d1과 d2는 같은 문자열입니다.");
		}else {
			System.out.println("equalsIgnoreCase()=>d1과 2d는 다른 문자열입니다.");
		}
		
	}

	public static void main(String[] args) { //매인메소드
		new StringTest(); //StringTest(); 랑 똑같은 생성자가 실행 위에서 4행
				
		
		
	}

}
