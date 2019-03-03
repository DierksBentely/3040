/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
	
	This is a program that will assign a object an observer that will
	call method update whenever a value is deleted
package assingment2q3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubject 
{
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	public void attach(Observer obs)
	{
		observers.add(obs);
	}
	
	public int getState()
	{
		return state;
	}
	
	public void setState(int st)
	{
		this.state=st;
		notification();
	}
	
	private void notification()
	{
		for (Observer observer : observers)
		{
			observer.update();
		}
	}
}
*/