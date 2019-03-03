/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
	
	This is a program that will assign a object an observer that will
	call method update whenever a value is deleted
*/

package assingment2q3;

import java.util.Scanner;
// main method
public class Main 
{
	public static void main(String[] args)
	{
		// setup scanner to take userInput
		Scanner scan = new Scanner(System.in);
		// creates a list of observers as oal
		ObservableArrayList oal = new ObservableArrayList();
		// creates some baseline objects
		Object object = new Object();
		Object object2 = new Object();
		Object object3 = new Object();
		// adds some baseline objects to test delete
		oal.append(object);
		oal.append(object2);
		oal.append(object3);

		String userInput="";
		
		// 
		while (!userInput.equals("exit"))
		{
			// method asking for append or delete
			System.out.println("append or delete?");
			userInput = scan.nextLine();
			
			// of append
			if (userInput.equals("append"))
			{
				// asking which object to append
				System.out.println("item 1, 2, or 3?");
				// taking 1 2 or 3
				userInput = scan.nextLine();
				// and adding that object to the front of the list
				if(userInput.equals("1"))
				{
					oal.append(object);
				}
				else if(userInput.equals("2"))
				{
					oal.append(object2);
				}
				else if(userInput.equals("3"))
				{
					oal.append(object3);
				}
			}
			// deleting the objects
			else if (userInput.equals("delete"))
			{
				// which object
				System.out.println("item 1, 2, or 3?");
				userInput = scan.nextLine();
				// taking 1, 2, or 3, and deleting that object
				if(userInput.equals("1"))
				{
					oal.delete(object);
				}
				else if(userInput.equals("2"))
				{
					oal.delete(object2);
				}
				else if(userInput.equals("3"))
				{
					oal.delete(object3);
				}
			}
		}
		// closing scanner
		scan.close();
	}
}
