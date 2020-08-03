import java.util.Scanner;
class MoneyCount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 = ");
		int cash = scan.nextInt();

		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0;

			while(cash>=50000){
				cash-=50000;
				a+=1;
			}
			if(a>0) System.out.println("50000원="+a+"장");
			while(cash>=10000){
				cash-=10000;
				b+=1;
			}if(b>0) System.out.println("10000원="+b+"장");
			while(cash>=5000){
				cash-=5000;
				c+=1;
			}if(c>0) System.out.println("5000원="+c+"장");

			while(cash>=1000){
				cash-=1000;
				d+=1;
			}if(d>0) System.out.println("1000원="+d+"장");
			while(cash>=500){
				cash-=500;
				e+=1;
			}if(e>0) System.out.println("500원="+e+"개");
			while(cash>=100){
				cash-=100;
				f+=1;
			}if(f>0) System.out.println("100원="+f+"개");
			while(cash>=50){
				cash-=50;
				g+=1;
			}if(g>0) System.out.println("50원="+g+"개");
			while(cash>=10){
				cash-=10;
				h+=1;
			}if(h>0) System.out.println("10원="+h+"개");
			while(cash>=1){
				cash-=1;
				i+=1;
			}if(i>0) System.out.println("1원="+i+"개");

	}
}


/* for문 예제참고
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 = ");
		int cash = scan.nextInt();
		String msg = " ";
		int result = 0;
		int money = 50000;

		for (int i=1; i<=10 ; i++){
			result=cash/money;
			cash=cash%money;

			if(money>=1000){
				msg = "장";
			}else{
				msg = "개";
			}
			if(result>0){
			System.out.printf("%d원 = %d%s", money, result, msg);
			System.out.println();
			}

			if(i%2==0){
				money/=2;	
			}else{
				money/=5;
			}
			

		}//for
*/
/* while문 예제참고
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 = ");
		int cash = scan.nextInt();
		String msg = " ";
		int result = 0;
		int money = 50000;
		int a=1;
		while(a<=10){
			result = cash/money;
			cash = cash%money;
	
			if(cash>=1000){
				msg = "장";
			}else{
				msg = "개";
			}
			if(result>0){
			System.out.printf("%d원 = %d%s", money, result, msg);
			System.out.println();
			}

			if(a%2==0){
				money/=2;
			}else{
				money/=5;
			}

			a++;
		}

*/

