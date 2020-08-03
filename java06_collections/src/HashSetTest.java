


import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		//Set interface : 입력순서(저장순서)를 유지하지 않는다. 뭐가 먼저 들어갔는지 모른다.
		//				    중복개체를 허용하지 않는다. 똑같은 개체가 들어오면 하나를 버린다.
		
		
	}

	public void start() {
		//						+	  -					+      -     중복 데이터 4개
		Double[] data = {23.6, 52.8, 85.6, 84.7, 12.8, 52.8, 85.6, 56.5};
		
		HashSet<Double> hs = new HashSet<Double>();
		for(Double d : data) {
			hs.add(d);
		}
		System.out.println("size="+hs.size()); //중복 데이터 허용하지 않기때문에 똑같은건 버린다.
		
		//HashSet은 get()메소드가 없다.
		//Iterator 인터페이스를 이용하여 데이터를 출력할수있다.
		
		Iterator<Double> iter= hs.iterator();  //데이터를 끄집어낼때는 다른 클래스에 의존해야한다.
		while(iter.hasNext()) {//객체가 있는지 확인
			double d = iter.next();
			System.out.println(d); //순서 유지 하지 않는다. 순서를 알고 싶다면 이 클래스는 쓰지 않는다.
		}
		
		
	}
	public static void main(String[] args) {
		new HashSetTest().start();
	}

}
