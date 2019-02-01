package assignment1;

public class Factory 
{
	private static Factory single= null;
	private Factory()
	{
		
	}
	
	public static Factory getInstance()
	{
		if (single == null)
			single = new Factory();
			return single;
	}

	public Object createDate(String format)
	{
		DateObject dateObj = new DateObject(format);
		return dateObj;
	}
	
	public Object createTime(String format)
	{
		TimeObject timeObj = new TimeObject(format);	
		return timeObj;
	}
}
