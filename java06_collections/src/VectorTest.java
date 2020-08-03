


import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {
		//List 인터페이스를 상속받은 컬렉션은 입력순서를 유지하고index를 가지고 있다.
		
	}
	

	public Vector getData() { //리턴해주는 데이터 타입이어야 하니까 void가 Vector로 바뀌어야한다.
		int num = 500;
		String name = "홍길동";
		Calendar now = Calendar.getInstance();
		now.set(2022,10,10);
		Random ran = new Random();
		double ave = 80.5;
		
		Vector vector = new Vector();
		vector.add(num); //Integer로 바뀌어서 object으로 들어감  //0번째 
		// 이 사이에 ave가 들어왔다.
		vector.addElement(name); //add처럼 추가하는기능. 어떤걸 써도 상관없다. //1번째 ->2
		vector.add(now);//2 ->3
		vector.add(ran);//3 ->4
		vector.add(1, ave);//이러면 ave가 1번째로 들어간다. 
		
		//이 안에 있는 데이터들은 object으로 들어간거다.
		//이걸 끄집어내려면 상위데이터니까 강제로 원래 데이터 형으로 형변환 해야한다.
		
		return vector;
	}
	//MemverVo랑 연결
	//학생정보
	public Vector getMember() {
		Vector v = new Vector();
		MemberVo vo = new MemberVo();
		vo.setNum(100);
		vo.setName("홍길동");
		vo.setTel("010-1234-5678");
		vo.setEmail("aaaa@nate.com");
		v.add(vo);
		
		MemberVo vo2 = new MemberVo(200, "이순신", "010-1111-1111", "bbbb@naver.com");
		v.add(vo2);
		v.add(new MemberVo(300, "세종대왕", "010-2222-3333", "cccccc@hanmail.net"));
		v.add(new MemberVo(400, "강감찬", "010-3333-4444", "asdq@naver.com"));
		v.add(new MemberVo(500, "이성계", "010-4444-5555", "ppppp@gmail.com"));
		
		return v;
		
		
	} 
}
