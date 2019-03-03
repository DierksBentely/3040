/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2;

// interface so has to define methods comments are the intended uses
public interface ListComponent 
{
	// adds a new item to the list
	public void addChild(int index, ListComponent child);
	// removes an item from the list
	public void removeChild(int index);
	// returns the value of the list component at a given index
	public ListComponent getChild(int index);
	// prints the values of the list
	public void printValue();
	
}
