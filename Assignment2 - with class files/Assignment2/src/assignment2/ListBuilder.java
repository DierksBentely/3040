/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2;

import java.util.ArrayList;
import java.util.List;

// listbuilder which is used to construct the list of lists
public class ListBuilder 
{
	// creates a list of list components which can be list composites or items
	List<ListComponent> list = new ArrayList<ListComponent>();
	// creates a list composite that will be used for distinguishing items from list composites
	ListComposite lc = new ListComposite();
	// index to be used later for list composite
	int index=0;
	// flag that determines if its a list composite or an item
	boolean isComp=false;

	public ListBuilder()
	{
		
	}
	
	// when an open bracket is found it starts a new list composite
	public void buildOpenBracket()
	{
		lc = new ListComposite();
		isComp=true;
		Item item = new Item('(');
		lc.addChild(index,  item);
		index++;
	}
	
	// when a close bracket is found it finishes the list composite
	public void buildCloseBracket()
	{
		isComp=false;
		Item item = new Item(')');
		lc.addChild(index, item);
		list.add(lc);
	}
	
	public void buildElement(int element)
	{
		// build element checks if boolean flag is comp is true
		// if isComp is true it adds to lc (list composite)
		// if isComp is false it adds to the list being built
		if (isComp == true)
		{
			// isComp is true creates new item adds it to lc (list composite)
			Item item = new Item(element-48);
			lc.addChild(index, item);
		}
		else
		{
			// isComp isn't true so it adds it to the list being built
			Item item = new Item(element-48);
			list.add(item);
		}
	}

	// prints the values of the list with each element being seperated by a line
	public void getList()
	{
		for (int i=0; i < list.size(); i++)
		{
			list.get(i).printValue();
			System.out.println();
		}
	}
}
