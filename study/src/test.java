import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class test {

	public test() {
	}
	
//	public int lotto(int num1, );


	
	public static void main(String[] args) {
		
		
		Random ran = new Random();	
		Vector<Integer> vector = new Vector<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		
		do{  //값 생성. 중복검사.			
		vector.clear();
		set1.clear();
		for(int i=0; i<7; i++) {
			vector.addElement(ran.nextInt(45)+1);
		}

		for(int i=0; i<7; i++) {
			set1.add(vector.elementAt(i));	
		}
		}while(set1.size()<7); 
		
		//트리셋에 6개 넣기
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<6; i++) {
		ts.add(vector.elementAt(i));
		}
				
		
		//출력 6개 + 보너스1개 출력
		Iterator<Integer> result = ts.iterator();
		System.out.print("Lotto = ");
		while(result.hasNext()) {
			System.out.print(result.next()+" ");
		}
			
		System.out.print("bonus = " + vector.elementAt(6));
		
		
//		set1.add(vector.elementAt(0));
		
//		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1,ran.nextInt(45)+1));//초기값 지정
//		do {
//		set.clear();
//		for(int i=0; i<7; i++) {
//		set.add(ran.nextInt(45)+1);
//		}					
//			
//		}while(set.size() < 7);
//		System.out.println(set1);

		

//		

//		
//		
//		
//		
//		
//			System.out.println();
//		
//			
//			
//			
//		for(int i=0; i<=5; i++) {
//		System.out.print(vector.elementAt(i)+" ");
//		}
//		System.out.print("bonus = " + vector.elementAt(6));
		
		

			
		
		
	
	}
//	public Vector lottoCheck(int i) {//i를 전달받는다. i가 4라면
//		for(int j=0; j<i; j++) {               //j는0~3
//			if(vector.addElement(j) ==  vector.addElement(i)) {
//				return --i; //하면 되는데 이걸 리턴을 해줘야한다.
//			}
//		}
//		return i; //똑같은값이 나오면 하나 줄여서 i를 리턴해주고 아니면 그냥 i를 리턴해준다.
//	}

}
