package Mandatory;

import java.text.*; 
import java.util.*;
public class labExcersise3Of6{ 
/**
              Method calculate the difference between the system date
              and user given date..............
**/	
public static void findDifference(String start_date,String end_date) throws ParseException 
{ 
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date d1 = sdf.parse(start_date); 
			Date d2 = sdf.parse(end_date); 
			long difference_In_Time = d2.getTime()-d1.getTime(); 
			long difference_In_Years=(difference_In_Time/(1000l * 60 * 60 * 24 * 365)); 
			long difference_In_Days=(difference_In_Time/(1000 * 60 * 60 * 24))%365; 
			System.out.print("Difference between two dates is: "); 
			System.out.println(difference_In_Years+" years, "+difference_In_Days +" days"); 
}
/**
----------------------------------------MAIN METHOD--------------------------------------------------------- 
**/ 
	public static void main(String[] args) throws ParseException 
	{ 
/**------------------------------------------Given start Date-----------------------------------------------**/ 
		String start_date = "10-01-2018"; 
/**------------------------------------------Given end Date-------------------------------------------------**/ 
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
        String end_date = dateFormat.format(date);  
		findDifference(start_date, end_date); 
} 
} 
