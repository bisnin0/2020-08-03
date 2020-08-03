import java.util.Scanner;
class MoneyCount2
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요.");
		int money = scan.nextInt();
		
		int won = 50000;
		int danwi = 5;

		while(won>=10){
			int cnt = money / won;
			if (cnt>0){
				System.out.print(won+"원="+cnt);
				if(won>=1000){
					System.out.println("장");
				}else{
					System.out.println("개");
				}
			}
			//다음화폐단위
			money -= cnt*won;
			won = won / danwi; // 10000
			if(danwi==5){
				danwi = 2;
			}else{
				danwi = 5;
			}
		}
		
	}
}

/*
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

Scanner scan = new Scanner(System.in);

		System.out.print("금액을 입력하세요 = ");
		int money = scan.nextInt();

		//50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
		//50000원
		int cnt = money / 50000;
		if(cnt>0){
			System.out.println("50000원="+cnt+"장");
			money = money - (cnt*50000);
		}
		//10000원
		cnt = money / 10000;
		if(cnt>0){
			System.out.println("10000원"+cnt+"장");
			money = money - (cnt*10000);
		}
		//5000원 이런식으로 조건 넣어도 괜찮
		
		if((cnt = money / 5000) > 0){
			System.out.println("5000원"+cnt+"장");
			money = money - (cnt*5000);
		}
		//1000원
		if((cnt = money / 1000) > 0){
			System.out.println("1000원"+cnt+"장");
			money = money - (cnt*1000);
		}
		//500원
		if((cnt = money / 500) > 0 ){
			System.out.println("500원"+cnt+"개");
			money = money - (cnt*500);
		}
		//100원
		if((cnt = money / 100) > 0){
			System.out.println("100원"+cnt+"개");
			money = money - (cnt*100);
		}




*/