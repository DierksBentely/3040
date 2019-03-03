/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2q2;

// Real text that is the high resource item
public class RealText implements Text
{
	// default value for the real text
	private String content="OCEAN MAN, take me by the hand lead me to the land, that you understand, OCEAN MAN the voyage to the corner of the globe is a real trip... OCEAN MAN the crust of a tan man imbibed by the sand, soaking up hte thirst of the land OCEAN MAN";
	
	public RealText(){}
	
	// prints the value of the real text
	@Override
	public void displayText() 
	{
		System.out.println(this.content);		
	}
	// manipulates the value of the real text
	@Override
	public void editText(String content) 
	{
		this.content=content;		
	}
	// does the job of both of the other methods
	@Override
	public void readWrite(String content) 
	{
		this.content = content;
		System.out.println(this.content);
	}
}
