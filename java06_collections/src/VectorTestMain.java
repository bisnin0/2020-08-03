


import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {

	public VectorTestMain() {
		
	}
	
	public void start() {
		VectorTest vt = new VectorTest(); //데이터가 있는 클래스를 객체로 생성
		Vector v = vt.getData(); // getData를 호출하면 리턴된걸 다음 수 있는 객체가 필요 v로 생성(Vector import필요)
		int num = (Integer)v.get(0); //500  원래 넣은 data는 int니까 int형 변수에 집어넣는다.
		////이 안에 있는 데이터들은 object으로 들어간거다.
		////이걸 끄집어내려면 상위데이터니까 강제로 형변환 해야한다. 원래 데이터 타입으로.
		double ave = (Double)v.get(1);  //80.5
		String name = (String)v.get(2); //홍길동
		Calendar date = (Calendar)v.get(3); //2022,10,10
		Random ran = (Random)v.get(4);
		
		
		System.out.println("num="+num);
		System.out.println("ave="+ave);
		System.out.println("name="+name);
		System.out.println("date="+date);
		System.out.println(ran.nextInt());
		
		
		//위에 이미 객체는 생성되어있음//MemverVo, VectorTest
		//학생정보
		Vector member = vt.getMember();  //MemberVo객체가 5개가 담겨있다.
		//VectorTest의 리턴받은 v를 member로 넘겨주는것. 데이터는 같고 주소만 다르다.
		//size() : 백터의 객체수를 구한다.
		member.remove(3); //이렇게 하면 3번째 데이터가 지워진다. 0,1,2,<3>,4
		for(int i=0; i<member.size(); i++) {
			MemberVo vo = (MemberVo)member.elementAt(i);
			vo.print();
		}
		
	}

	public static void main(String[] args) {
		new VectorTestMain().start();
	}

}
