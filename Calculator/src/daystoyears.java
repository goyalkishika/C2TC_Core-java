import java.util.Scanner;

public class daystoyears {

	public static void main(String[] args) {
	int days,weeks,months,years;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of days: ");
	days=sc.nextInt();
	years=days/365;
	days=days%365;
	System.out.println("years: "+years);
    months = days /30;
    days = days % 30;
	System.out.println("months: "+months);
    weeks = days / 7;
    days = days % 7;
	System.out.println("weeks: "+weeks);
	System.out.println("days: "+days);
    
	
	
	
	

	}

}
