import java.util.Calendar;
import java.util.Scanner;
public class CalendarOOP {
	Calendar date = Calendar.getInstance();  //현재날짜
	
	
	public CalendarOOP() {}

	//입력 - 콘솔에서 정수입력
	public int getInt(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"->");
//		int num =scan.nextInt();
//		return num;
		return scan.nextInt(); //위에와 같은결과지만 바로 해도 된다.
				
	}	
	
	//요일 - 입력받은 년,월,1일이 무슨요일인지 구한다.
	public int getWeek(int year, int month) { //여기엔 아래서 입력한 y, m이 없기때문에 보내고 받게 해야 한다.
//		Calendar date = Calendar.getInstance();  //현재날짜
		date.set(year, month-1, 1);
//		int w = date.get(Calendar.DAY_OF_WEEK);
		return date.get(Calendar.DAY_OF_WEEK);		
	}
	
	//제목
	public void titlePrint(int week, int day) {
		String weekStr[] = {"일","월","화","수","목","금","토"};
		for(String w:weekStr) {
			System.out.print(w+"\t");
		}
		System.out.println();
		spacePrint(week, day);
	}
	//공백
	public void spacePrint(int week, int day) {
		for (int i=1; i<week; i++) {
			System.out.print("\t");
		}
		dayPrint(week, day); //보내는쪽은 데이터타입을 쓰면 안된다.
		
		
	}
	
	//날짜
	public void dayPrint(int day, int week) { //요일이 있어야 줄바꿈을구할수있다.
		for(int d=1; d<=day; d++) {
			System.out.print(d+"\t");
			if((week-1+d)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	} 
	
	public void start(){
		int y = getInt("년도"); 
		int m = getInt("월");
		int w = getWeek(y,m); //getWeek에 y값을 int year에 보내고, m값을 int month로 보내라.
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);//마지막 날 구하기
//		System.out.println("요일="+w);
//		System.out.println("마지막날"+lastDay);
		
//		titlePrint();
//		spacePrint(w);
//		dayPrint(lastDay, w);
		titlePrint(w, lastDay);
		
	}
		
	
/*	public static void main(String args[]) {
		CalendarOOP oop = new CalendarOOP();
		oop.start();
		System.out.println("프로그램이 종료되었습니다."); 
	}
*/	//개발이 끝나서 지우는것
	
}
/*	
//	Scanner scan = new Scanner(System.in);
	Calendar date = Calendar.getInstance();	
	int year, month, week, lastDay=31;
	
	public CalendarOOP() {}
	
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
					lastDay = 29;
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
		CalendarOOP oop = new CalendarOOP();
		oop.start();
	}

*/

