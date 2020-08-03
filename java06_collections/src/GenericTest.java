//제너릭 클래스
public class GenericTest<V> { //제너릭
	private V name; //아래 설명 참고
	public GenericTest() {

	}
	
	
	public void setName(V name){
		this.name = name;
	}
	
	public V getName() {  //V를 리턴하는것. 원래는 String써놨었음
		return name;
	}
		
		
}

//new GenericTest<String>()하면 V가 String이 된다.
//new GenericTest<Calendar>() 하면 V가 Calendar가 된다.
//V에 뭘 쓰느냐에 따라 달라짐