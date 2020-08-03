import java.util.Scanner;
class StandardWeight
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 = ");
		int age = scan.nextInt();
		System.out.print("성별(1:남성, 2:여성) = ");
		int gender = scan.nextInt();
		System.out.print("키 = ");
		double height = scan.nextDouble();
		System.out.print("현재체중 = ");
		double weight = scan.nextDouble(); 

		double aveWeight = 0;
		if(age<36 && gender==1){
			aveWeight = (height-100)*0.90;
		}else if(age<36 && gender==2){
			aveWeight = (height-100)*0.85;
		}else if(age>=36 && gender==1){
			aveWeight = (height-100)*0.95;
		}else if(age>=36 && gender==2){
			aveWeight = (height-100)*0.90;
		}

					
		double aw = (weight/aveWeight)*100;

		String result = "";
		if(aw<=85){
			result = "마른형";
		}else if(aw<=95){
			result = "조금마른형";
		}else if(aw<=115){
			result = "표준형";			
		}else if(aw<=125){
			result = "조금 비만형";
		}else{
			result = "비만형";
		}

		System.out.println("표준체중 = "+aveWeight);
		System.out.println("당신의 표중체중지수는 "+aw+"으로 "+result+"입니다.");


		


	}
}
