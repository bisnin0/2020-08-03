

public class ExceptionTest3 {

	public ExceptionTest3() {
			sum();		
//			Thread.sleep(2000); //1000=1s, 2000=2s  �ð����� .. �� �޼ҵ带 ������ �ݵ�� ����ó���� ������Ѵ�. ���ϰ��� ����� �� ����. sleep
//								//InterruptedException
			
			try{
			Thread.sleep(2000); // ����Ϸ��� �̺κ��� ����ó���ؾ���.
								
			}catch(InterruptedException ie) {
				System.out.println("���ܹ߻���...");
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