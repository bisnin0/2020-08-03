import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
//MemberVo 클래스 (어제만든거) 활용해서 작성
	public HashMapTest() {
	}

	public void start() {
		
		//HashMap : 동기화하지 않는다.   Hashtable : 동기화한다.
//		HashMap<String, MemberVo> map = new HashMap<String, MemberVo>();  //다 만들고 hashtable로 클래스를 바꿔본다.
	
		Hashtable<String, MemberVo> map = new Hashtable<String, MemberVo>();
		
		MemberVo vo= new MemberVo(50, "홍길동", "010-7899-2121", "abcd@nate.com");
		map.put("홍길동", vo); //이 데이터가 위 map에 담긴다.
		map.put("강감찬", new MemberVo(10, "강감찬", "010-9999-4444", "great@naver.com"));
		map.put("세종대왕", new MemberVo(30, "세종대왕", "010-1212-1212", "best1234@hanmail.net"));
		map.put("이순신", new MemberVo(25, "이순신", "010-7412-1111", "asdf@nate.com"));
		map.put("김삿갓", new MemberVo(40, "김삿갓", "101-222-5555", "hhhhh@naver.com"));
		
		//key를 이용한 정보 얻어오기
		MemberVo vo2 = map.get("강감찬"); //키를 입력하면 memberVo데이터타입으로 아웃풋된다.
		vo2.print();
		System.out.println("===================================================");
		//key의 목록 구하기
		Set<String> keyList = map.keySet();
		Iterator<String> key = keyList.iterator();
		
		while(key.hasNext()) {
			MemberVo vo3 = map.get(key.next());
			vo3.print();
		}
		System.out.println("-----------------------");
		//value 목록 구하기
		Collection<MemberVo> value = map.values(); //map은 위에서 HashMap의 객체로지정되어있다.
		
		Iterator<MemberVo> v = value.iterator();
		while(v.hasNext()) {
			MemberVo vo4 = v.next();
			vo4.print();
		}
	}
	public static void main(String[] args) {
		new HashMapTest().start();
	}

}
