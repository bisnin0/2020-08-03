import java.util.Calendar;
import java.util.Scanner;
public class CalendarOOP__Me {
//	Scanner scan = new Scanner(System.in); 
	Calendar date = Calendar.getInstance();	
	int year, month, week, lastDay=31;
	
	public CalendarOOP__Me() {}
	
	public void year2() { //년 입력
		Scanner scan = new Scanner(System.in);		
		System.out.print("년도 =");
		year = scan.nextInt();
		System.out.print("월 = ");
		month = scan.nextInt();
	}
//	public void month2() { //월 입력
//		Scanner scan = new Scanner(System.in);		
//		System.out.print("월 = ");
//		month = scan.nextInt();
//	}
	public void set2() {
				
		date.set(year, month-1, 1);
		week=date.get(Calendar.DAY_OF_WEEK);
	}
	public void lastDay2() {

		switch(month) {
			case 4: case 6: case 9: case 11:
				lastDay=30;
				break;
			case 2:
				if(month%4==0 && month%100!=0 || month%400==0){
					lastDay = 29; //왜 29일만 출력 안되고 무조건 28일뜨는건지?
				}else{
					lastDay = 28;
				}
				
		}
	}
	public void end() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int s=1; s<week; s++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if((i + (week-1))%7==0) {
				System.out.println();
			}
		}
	}
	public void start () {
		year2();
//		month2();
		set2();
		lastDay2();
		end();

	}
	
	public static void main(String args[]) {
		CalendarOOP__Me oop = new CalendarOOP__Me();
		oop.start();
	}


}
