

public class ExceptionTest3 {

	public ExceptionTest3() {
			sum();		
//			Thread.sleep(2000); //1000=1s, 2000=2s  시간지연 .. 이 메소드를 쓰려면 반드시 예외처리를 해줘야한다. 안하고는 사용할 수 없다. sleep
//								//InterruptedException
			
			try{
			Thread.sleep(2000); // 사용하려면 이부분을 예외처리해야함.
								
			}catch(InterruptedException ie) {
				System.out.println("예외발생됨...");
			}
			
			oddSum();
		
	}
	
	public void sum() {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	public void oddSum() {
		int oddSum=0;
		for(int i=1; i<=100; i+=2) {
			oddSum+=i;
		}
		System.out.println("oddSum="+oddSum);
	}

	public static void main(String[] args) {
		new ExceptionTest3();
		
	}

}
