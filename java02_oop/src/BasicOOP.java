//package p1.p2.p3; 패키지와 패키지 사이는 .으로 
import java.lang.String;
import java.util.Scanner;
import java.io.*; //자바 패키지 안에 io라는 패키지가 있고, 그 안에 클래스 전체

public class BasicOOP {
	//전역변수(멤버변수) 클래스 안에 정의해야함
	int a=1234; //0
	String name; //null

	//생성자 메소드: 객체를 생성할때 한번 실행한다.
	//			 메소드명이 반드시 클래스명과 같아야 한다.
	//생성자 메소드는 반환형이 없다. void등 XX	
	public BasicOOP() { //위에 BasicOOP와 같아야 한다는것. 여러개 있을 수 있다.
	
		System.out.println("생성자="+a);		
	}
	public BasicOOP(int a) {
		
	}
	//메소드 변환형
	//	     메소드는 소문자로 시작한다. 합성어일 경우 두번째 단어부터 첫 문자는 대문자로.. 
	//	     숫자 사용도 가능하지만 첫번째 문자는 영어 소문자여야 한다.
	public void sum() {
		//기능구현
		int s=0;
		for(int i=1; i<10; i++) {
			s += i;
		}
		System.out.println("s="+s);
		System.out.println("sum->a="+a);		
	}
	public void add(int a, int b) {  
		int c = a + b;
		System.out.println("c="+c);
		class BBB{
			//메소드 내의 내부클래스	
		}
	}
	public String getName() {
		return "홍길동"; //getName은 반환형이 String이다. getName을 호출하면 String "홍길동"이 돌아온다. 
	}
	
	class AAAA{ //class 내에 또 class를 만든다. 내부클래스
		
	}
}//class
