


import java.util.Stack;

public class StackTest {

	public StackTest() {
	}
	public void start() {
		//Stack : 입력순서유지, 중복데이터 허용, FILO(먼저 넣은게 마지막에나온다.)
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(100);
		stack.add(200);
		stack.add(300);
		stack.add(400);		//
		
		while(!stack.empty()) {  //비어있으면 true가 들어오니 !반대로
			System.out.println(stack.pop()); //
		}
		
		
	}
	public static void main(String[] args) {
		new StackTest().start();
	}

}
