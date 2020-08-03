import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		//TreeMap : key, value를 가진다.
		//			key를 기준으로 정렬되어 있다.  ... 이름으로쓰면 이름순으로, 번호로쓰면 번호순으로
		
		TreeMap<String, MemberVo> tm = new TreeMap<String, MemberVo>();
		
		MemberVo vo= new MemberVo(50, "홍길동", "010-7899-2121", "abcd@nate.com");
		tm.put("홍길동", vo); //이 데이터가 위 map에 담긴다.
		tm.put("강감찬", new MemberVo(10, "강감찬", "010-9999-4444", "great@naver.com"));
		tm.put("세종대왕", new MemberVo(30, "세종대왕", "010-1212-1212", "best1234@hanmail.net"));
		tm.put("이순신", new MemberVo(25, "이순신", "010-7412-1111", "asdf@nate.com"));
		tm.put("김삿갓", new MemberVo(40, "김삿갓", "101-222-5555", "hhhhh@naver.com"));
		
		MemberVo vo2 = tm.get("이순신");
		vo2.print();
		System.out.println("************key*************");
		Set<String> KeyList= tm.keySet();  //tm.key까지만 쓰면 어떤값이 리턴되는지 나오는데 참조하면 좋다.
		Iterator<String> i = KeyList.iterator();
		while(i.hasNext()) {
			MemberVo vo3 = tm.get(i.next());
			vo3.print();
		}
		System.out.println("************value*************");
			
		
		Collection<MemberVo> value = tm.values();
		Iterator<MemberVo> v = value.iterator();
		while(v.hasNext()) {
			MemberVo vo4 = v.next();
			vo4.print();
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		TreeMapTest tmt = new TreeMapTest();
		tmt.start();
	}

}
