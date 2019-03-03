/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2q2;

// proxy text
public class ProxyText implements Text
{
	// has a value that references the real text
	private RealText real = new RealText();
	// calls display text on the real text
	public void displayText()
	{
		real.displayText();
	}
	// calls edit text on the real text
	public void editText(String content)
	{
		real.editText(content);
	}
	// calls read write on the real text adn overwrites and displays it
	public void readWrite(String content)
	{
		real.readWrite(content);
	}
}
