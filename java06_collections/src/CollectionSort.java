import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CollectionSort {
	Random ran = new Random();
	public CollectionSort() {
	}

	//treeset에 안하고 여기에 하는 이유는 중복 데이터를 살리기 위해서. treeset은 중복데이터를 용납하지 않지만 list.sort는 허용한다. 1, 2, 3, 3, 3 ,4, 5
	//List 정렬
	public void listSort() {
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			lst.add(ran.nextInt(100)+1);
			
		}
		System.out.println("정렬전="+lst.toString());
		//정렬
		Collections.sort(lst); //정렬 오름차순
		System.out.println("정렬후="+lst.toString());
		
		//정렬 내림차순 reverse() .. 반대로 뒤집는거라 오름차순 정렬 후 사용해야한다.
		
		Collections.reverse(lst); //내림차순
		System.out.println("정렬후="+lst.toString());
		
		
		/////////////////////////////////////////////////////
		String names[] = {"코스모스","장미","튤립","히아신스","목련","개나리","해바라기"};
		List<String> lst2 = new ArrayList<String>();
		for(String name:names) {
			lst2.add(name);
		}
		System.out.println("정렬전="+lst2.toString()); //lst2의 문자열 리턴해준다. toString()
		
		Collections.sort(lst2);
		System.out.println("정렬후="+lst2.toString()); //오름차순
		
		Collections.reverse(lst2);
		System.out.println("정렬후="+lst2.toString());//반대로. 내림차순
		
		
	}
	
	//컬렉션에 객체의 내용중 일부를 데이터로 정렬할 경우
	public void objectSort() {
		List<MemberVo> lst = new ArrayList<MemberVo>();
		
		
		
		//lst 안에 vo데이터가 5개. vo데이터 안에는 나이 이름 전화번호 이메일
		lst.add(new MemberVo(50, "홍길돌", "010-7899-2121", "abcd@nate.com")); 
		lst.add(new MemberVo(10, "강감찬", "010-9999-4444", "great@naver.com"));
		lst.add(new MemberVo(30, "세종대왕", "010-1212-1212", "best1234@hanmail.net"));
		lst.add(new MemberVo(25, "이순신", "010-7412-1111", "asdf@nate.com"));
		lst.add(new MemberVo(40, "김삿갓", "101-222-5555", "hhhhh@naver.com"));		
		
		
		////번호를 오름차순으로 정렬   == 아래 내부클래스의 영향
		System.out.println("===================번호를 오름차순으로 정렬===================");
		Collections.sort(lst, new CompareNumAsc());
		for(MemberVo vo : lst) {
			vo.print();
		}
		
		////번호를 내림차순으로 정렬 == 아래 내부클래스의 영향
		System.out.println("===================번호를 내림차순으로 정렬===================");
		Collections.sort(lst, new CompareNumDesc());
		for(MemberVo vo : lst) {
			vo.print();
		}
		
		////이름을 오름차순으로 정렬  ==  아래 내부클래스의 영향
		System.out.println("===================이름을 오름차순으로 정렬===================");
		Collections.sort(lst, new CompareNameAsc());
//		for(MemberVo vo : lst ) {
//			vo.print();
		output(lst);  //계속 반복되니까 아래 메소드 만들고 가져온거.
		
		
	
		////이름을 내림차순으로 정렬  == 아래 내부 클래스의 영향
		System.out.println("===================이름을 내침차순으로 정렬===================");
		Collections.sort(lst, new CompareNameDesc());
		output(lst);
		}
		public void output(List<MemberVo> lst) {
			for(MemberVo vo : lst) {
				vo.print();
			}
		
	}
	
	//정렬기준을 comparator interface를 상속받은 후 compare() 메소드를 오버라이딩 하여 정렬 기준으로 적용한다.
	// ===================
	//이름을 오름차순으로 정렬하는 클래스    //StringCompareTo 부분 참조 왼쪽 오른쪽  빼서 양수 음수 0
	class CompareNameAsc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) {
			return v1.getName().compareTo(v2.getName());//양수, 음수, 0
		}
	}
	
	// ===================
	//이름을 내림차순으로 정렬하는 클래스
	class CompareNameDesc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) {
			return v2.getName().compareTo(v1.getName()); //좌우 순서 바꾼다.
		}
	}	
	
	
	// ===================
	//번호를 오름차순으로 정렬하는 내부 클래스를 만든다
	class CompareNumAsc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) { //오버라이딩
			//v1이 작으면 -1을 리턴, v2가 작으면 1을 리턴, v1과 v2의 값이 같으면 0을 리턴한다.
//			int r = (v1.getNum()  <  v2.getNum())? -1 : (v1.getNum() > v2.getNum())? 1 : 0;   //v1의 번호를 알려면 MemberVo클래스의 getNum()을 이용해야한다. num이 private라 바로 못쓴다.
//			return r;
			
			return (v1.getNum()  <  v2.getNum())? -1 : (v1.getNum() > v2.getNum())? 1 : 0;   
						
		} 
	}
	
	// ===================
	//====================
	//번호를 내림차순으로 정렬하는 내부 클래스를 만든다
	class CompareNumDesc implements Comparator<MemberVo>{
		public int compare(MemberVo v1, MemberVo v2) {
			//v1이 작으면 1을 리턴, v2가 작으면 -1을 리턴, v1과 v2의 값이 같으면 0을 리턴한다.
			return (v1.getNum() < v2.getNum())? 1 : (v1.getNum() > v2.getNum())? -1: 0;
		}
	}
	//=========================
	
	
	
	
	
	public void start() {
		listSort();
		System.out.println("===============================================================");
		objectSort();
	}
	
	public static void main(String[] args) {
		CollectionSort cs = new CollectionSort();
		cs.start();
	}

}
