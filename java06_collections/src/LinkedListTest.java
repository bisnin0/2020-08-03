


import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
	}
	public void start() {
		//LinkedList : 입력순서 유지, queue, deque 처리를 할 수 있다.
		//			      객체를 output하면 컬렉션에서 객체가 제거된다. 이부분 가장 중요.
		
		//queue = 먼저 입력된 객체가 먼저 출력 : First In First Out
		//deque = 양쪽으로 데이터를 넣고 뺄 수 있다.
		
		LinkedList<String> ll = new LinkedList<String>();

		//queue
		//객체 추가
		ll.offer("홍길동");
		ll.offer("이순신");
		ll.offer("세종대왕");
		//queue = 한쪽으로 들어가서 쌓이고 반대쪽으로 먼저 쌓인것부터 나오는것. 나오면 삭제된다.
		
		//객체 수 구하기
		System.out.println("객체수="+ll.size()); //3개
		String str = ll.poll(); // 먼저 들어간 객체를 str로 ll에서 빼서 넣는다.
		System.out.println("str="+str); //홍길동
		System.out.println("객체수="+ll.size()); //2개.. 홍길동이 제거된것
		
		//deque
		ll.offerFirst("지코"); // 가장 오른쪽에 집어넣음
		System.out.println("객체수="+ll.size());
		
		String str2 = ll.pollLast(); //가장 왼쪽거 뺌
		System.out.println("str2="+str2);
		System.out.println("객체수="+ll.size());
		
		
		//컬렉션의 모든 객체를 순서대로 출력하라.
		//index가 없다. for 아닌 while문으로 출력
		
		while(!ll.isEmpty()){ //객체가 있을때 false,없을때 true 결과를 리턴해주는 메소드
			//출력	데이터가 있을때 true여야만 while문이 실행되니까 false를 true로 만들려면 ! 부정해주면된다.
			System.out.println("-->"+ll.poll());
			
		}
	
		
		
		
	}
	public static void main(String[] args) {
		new LinkedListTest().start();
	}

}
