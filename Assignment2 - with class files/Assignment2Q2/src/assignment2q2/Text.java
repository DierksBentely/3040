/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2q2;

// interface for text which allows the proxy to take the roll of the real
public interface Text 
{
	// methods for read
	public void displayText();
	
	// write
	public void editText(String content);
	
	// and read and write
	public void readWrite(String content);

}
