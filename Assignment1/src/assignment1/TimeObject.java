package assignment1;

import java.time.LocalTime;

public class TimeObject 
{
	String time;
	int hour = LocalTime.now().getHour();
	int minute = LocalTime.now().getMinute();
	int second = LocalTime.now().getSecond();
	public TimeObject(String format)
	{
		if (format.equals("1"))
		{
			time = (hour + ":" + minute + ":" + second);
		}
		else if(format.equals("2"))
		{
			time = (second + "," + minute + "," + hour);
		}
		else
		{
			System.out.println("please enter a 1 for format 1 or a 2 for format 2");
		}
	}
	public String toString()
	{
		return this.time;
	}
}