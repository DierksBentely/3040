package assignment1;

import java.time.LocalDate;

public class DateObject 
{
	String date;
	int month = LocalDate.now().getMonthValue();
	int day = LocalDate.now().getDayOfMonth();
	int year = LocalDate.now().getYear();
	public DateObject(String format)
	{
		if (format.equals("1"))
		{
			this.date = (month +"/" + day +"/"+ year);
		}
		else if(format.equals("2"))
		{
			this.date = (day +"/" + month +"/"+ year);
		}
		else
		{
			System.out.println("please enter a 1 for format 1 or a 2 for format 2");
		}
	}
	public String toString()
	{
		return this.date;
	}
}