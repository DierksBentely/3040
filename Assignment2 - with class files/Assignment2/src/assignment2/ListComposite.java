/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assignment2;

import java.util.ArrayList;
import java.util.List;

// data type list composite 
public class ListComposite implements ListComponent 
{
	// which contians a list of list components
	List<ListComponent> list = new ArrayList<ListComponent>();
	
	// adds new item to the list
	@Override
	public void addChild(int index, ListComponent child) 
	{
		this.list.add(child);
	}

	// removes a given item from list, this isn't actually used ever
	@Override
	public void removeChild(int index) 
	{
		list.remove(index);
	}

	// returns a value at a specific index
	@Override
	public ListComponent getChild(int index) 
	{
		return list.get(index);
	}

	// prints the values in the list
	@Override
	public void printValue()
	{
		for (int i = 0; i < this.list.size(); i++)
		{
			this.list.get(i).printValue();
		}
	}
}
