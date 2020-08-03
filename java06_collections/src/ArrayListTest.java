


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

	public ArrayListTest() {

	
	
	}
	
	public void start() {
		//순서를 유지하고 , index를 가지고 있다.
		List al = new ArrayList();  //List는 상위 인터페이스. new List는 할수없다. 인터페이스라. 
		// ArrayList al해도 되지만 List를 많이 쓴다. 왜냐하면 List에 담아도 기능에 차이가 없기때문에. 
		al.add(100);
		al.add(10.6);
		al.add(new VectorTest()); //클래스를 가져온것
		al.add("서울시 마포구 백범로");
		
		double data1 = (double)al.get(1); 
		System.out.println(data1);
		
		
		VectorTest vt = (VectorTest)al.get(2);  //클래스를 가져온것
		Vector v = vt.getData(); // VectorTest클래스의 getData는 Vector가 리턴되고있다.
		String name = (String)v.get(2);
		System.out.println("name="+name);
			
		Vector v2 = vt.getMember();
		for(int i=0; i<v2.size(); i++){
			MemberVo vo = (MemberVo)v2.get(i);
			vo.print();
		}
		
		////제너릭
		// 	E:element  K:key		V:value
		List<String> data = new ArrayList<String>(); //<>제너릭  data에는 String 객체만 추가할 수 있다.
		List<MemberVo> data2 = new ArrayList<MemberVo>(); // data2에는 MemberVo 객체만 추가할 수 있다.
		//제너릭은 컬렉션 추가하는 객체형을 정하는 것이다.
		
		//data.add(12345); //위에 제너릭에서 String만 추가하게 했기때문에 에러
		data.add("12345");
		data.add("자바컬렉션");
		
		String str = data.get(1); //형변환 안해도 꺼내진다. 제너릭으로 만들면
		System.out.println(str);  //제너릭이 있는 컬렉션은 get()호출 할때 형변환을 할 필요가 없다.
		
		data2.add(new MemberVo(111,"hong", "010-1234-5678","kakjs@naver.com"));
		//data2.add(Calendar.getInstance()); -> MemberVo객체가아니어서 못들어간다. 에러
		
		MemberVo vo3 = data2.get(0);
		vo3.print(); //출력. 
		
		System.out.println(data);
		System.out.println(data2);
		
		
		
		List<Integer> data3 = new ArrayList<Integer>();
		for(int i=1; i<100; i+=8) {
			data3.add(i);
		}
		System.out.println("size="+data3.size());

		Object arr[] = data3.toArray(); //배열로 만드는것
		for(Object obj:arr) {
			System.out.println(obj);
		}
		
	
		
		
	}
	public static void main(String[] args) {
		new ArrayListTest().start();
	}

}
