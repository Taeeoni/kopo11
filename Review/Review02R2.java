package Review02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Review02R2 {

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		String birth = scan.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date today = new Date();
		Date birthDay = format.parse(birth);
		String nowTime = format.format(today);
		String birthTime = format.format(birthDay);
				
		System.out.println("Current Date");
		System.out.println(nowTime);
		System.out.println("Birthday");
		System.out.println(birthTime);
		
		String a = "";
		String b = "";
		for(int i = 0; i < 4; i++) {
			a += nowTime.charAt(i);
			b += birthTime.charAt(i);
		}
		
		
		int al = Integer.parseInt(a);
		int bl = Integer.parseInt(b);
		
		//get time needs to instance of date 
		long diffDay = ((today.getTime() - birthDay.getTime()) / (1000*60*60*24) );		
		System.out.println(diffDay);
		long diffYear = (diffDay / 365);
		System.out.println(diffYear + "years old in international age");
		System.out.println((al - bl) + 1 + "years old in Korean age" );
	
	}
}
