package javaAPI;

public class StringBufferTest {
	public StringBufferTest() { //생성자메소드
		//생성자메소드는 객체생성할때 실행된다. 객체안만들면 실행안됨
		//문자열을 처리, 데이터수정되더라도 주소를 옮기지 않는다.
		//StringBuffer클래스
		//StringBuilder클래스
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(50);
		StringBuffer sb3 = new StringBuffer("자바");
		//메모리 크기를 구하는 메소드다.
		
		
		StringBuffer sb4 = new StringBuffer();
		
		sb4.append("StringBuffer"); //문자열 추가
		sb4.append("객체 테스트 중입니다.");  
		//문자열 길이 구하기
		System.out.println("length="+sb4.length()); //글자 수 = "StringBuffer(12) + 객체 테스트 중입니다.(12  공백과 점까지)"
		
		
		//문자열 삽입 : index위치에 문자열 삽입
		sb4.insert(8, "인터페이스");
		System.out.println("sb="+sb4);
		//012345678 90
		//StringBu인터페이스ffer객체 테스트 중입니다.
		sb4.delete(3, 7);
		System.out.println("sb4="+ sb4);
		//Stru인터페이스ffer객체 테스트 중입니다.
		//0127890 (3부터 7앞까지 삭제)
		
		sb4.reverse();//문자열 앞뒤 바꾸기
		System.out.println("sb4="+sb4); //문자열이 뒤집힌다.
		
		String str = "test replace";
		StringBuffer st4 = new StringBuffer("test replace");
		
		str =str.replaceAll("test", "테스트");
		//String은 데이터가 변경되면 다시 대입해주어야 한다.
		//str.replaceAll("test", "테스트"); 이렇게 쓰면 변경되지 않는다.
		st4.replace(0, 4, "테스트");
		
		System.out.println("str = " + str);
		System.out.println("st4 = " + st4);
		
		
		System.out.println("capacity = "+sb.capacity()+","+sb2.capacity()+","+sb3.capacity()+","+sb4.capacity());
		//capacity = 16(sb), 50(sb2), 18(sb3) (기본 16바이트는 확보를 해논다는 뜻. 16글자를 저장할 수 있는 공간이 확보되어있다.)
		//sb2는 연속공간으로 50글자가 들어가있는 공간을 확보한다.
		//sb3는 2글자 + 16 해서 18바이트.
		//sb4는 34가 나온다. 글자 수가 아니라 확보된 바이트 숫자가 34라는뜻.		
		
		
	}
	
	public static void main(String[] args) {
		new StringBufferTest(); //객체생성. 위에 생성자메소드를 실행
	}

}
