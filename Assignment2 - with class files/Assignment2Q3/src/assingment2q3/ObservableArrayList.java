/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
*/
package assingment2q3;

import java.util.ArrayList;
// creates an arraylist that can be observed by the observer
public class ObservableArrayList extends Observer
{
	ArrayList<Object> subject = new ArrayList<Object>();

	// update method that is called when a change is made
	@Override
	public void update() 
	{
		System.out.println("an item is being removed");
	}

	// method to add to the list
	void append(Object obj)
	{
		subject.add(0, obj);
	}
	
	// method to delete which causes the update method to call
	void delete(Object obj)
	{
		subject.remove(subject.size()-1);
		update();

	}
}
