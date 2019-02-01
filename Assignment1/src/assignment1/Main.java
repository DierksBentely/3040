package assignment1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Factory fact = Factory.getInstance();
		char op = 'x';
		while (op != 'q')
		{
			System.out.println("which operation do you want: \nd = display current date, \nt = display"
					+ "current time, \nq = quit program");
			op = scan.next().charAt(0);
			if(op == 'd')
			{		
				System.out.print("what format do you want for date 1 or 2? ");
				String formatDate = scan.next();
				
				Object dateObj = fact.createDate(formatDate);
				
				System.out.println("Date: " + dateObj.toString());
				
			}
			else if (op == 't')
			{
				System.out.print("what format do you want for time 1 or 2? ");
				String formatTime = scan.next();
				
				Object timeObj = fact.createTime(formatTime);
				
				System.out.println("Time: " + timeObj.toString());

			}
		}
		
		System.out.println("have a nice day");
		scan.close();
		System.exit(0);

	}
}