/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2;

// class for items which are not lists
public class Item implements ListComponent
{
	// sets a value of the item
	int value=-1;
	// sets a character for the item
	char bracket= ' ';
	
	// if an item is passed a value its value is now that
	public Item(int value)
	{
		this.value=value;
	}
	// if an item is passed a character its not a number so its a bracket
	public Item(char bracket)
	{
		this.value=-1;
		this.bracket = bracket;
	}
	
	//these don't really do anything for the singleton items so they are empty
	// from here______________________________________
	@Override
	public void addChild(int index, ListComponent child) {}
	@Override
	public void removeChild(int index) {}
	@Override
	public ListComponent getChild(int index) {return null;}
	// to here ___________________________________________

	// prints value of the item
	@Override
	public void printValue() 
	{
		// checks for the default values of the items
		// -1 isn't enterable beginning so if its -1 it was never overwritten meaning its a bracket
		if(this.value != -1)
		{
			System.out.print(this.value);
		}
		// since at this point we know its a bracket checks for left
		else
		{
			System.out.print(this.bracket);
		}
		
	}
}
