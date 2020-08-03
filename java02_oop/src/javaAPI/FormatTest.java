package javaAPI;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {  //format = 표시형식  format을 바꾼다 = 표시형식을 바꾼다.
		//화폐단위 표시
		try { //예외처리. 아직 안배운거
		int money = 5127428; //51,274,284원
		DecimalFormat fmt = new DecimalFormat("#,###원"); //3자리마다 하나씩이니까 나머지는 알아서 해준다.
		String moneyStr = fmt.format(money);  //숫자를 화폐단위로 만들어주면서 문자로 바뀐다.
		System.out.println("Money="+moneyStr);
		
		int money2 = 5127; //5,127원
		DecimalFormat fmt2 = new DecimalFormat("#,###,###원"); 
		String moneyStr2 = fmt2.format(money2);
		System.out.println("Money="+moneyStr2);
		
		int money3 = 5127428; //51,274,284원
		DecimalFormat fmt3 = new DecimalFormat("0,000,000원"); 
		String moneyStr3 = fmt.format(money3);
		System.out.println("Money="+moneyStr3);
		
		
		//화폐단위 문자를 숫자로 변환
		NumberFormat fmt4 = NumberFormat.getNumberInstance();		
		Number num = fmt4.parse(moneyStr);
		
		int numInt = num.intValue();
		System.out.println("numInt="+numInt); //5127428
		
		}catch(Exception e) {} ////예외처리 아직 안배운거.try~catch
		
		
		//날짜를 이용한 format
		Calendar now = Calendar.getInstance();
		SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd(E) HH:mm:ss"); //API 참조하면 뭘 의미하는지 나온다.
		String dateStr = dateFmt.format(now.getTime());
		System.out.println("dateStr="+dateStr);
		
		
		
		
	}

	public static void main(String[] args) {
		new FormatTest();

	}

}
