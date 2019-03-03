/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
	
	This is a program that will take a string input as follows
	( = the beginning of a list composition
	) = the ending of a list composition
	, and spaces are ignored
	numbers are treated as items, 
	a list composition is 1 item in the list that contains the other items in the composition
	if you enter a letter it will count as a number but it will be like 40 or something, it will still work though
*/
package assignment2;
import java.util.Scanner;

public class Main 
{
	// main method
	public static void main(String[] args)
	{
		// scanner takes user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a series of numbers");
		String userInput = scanner.nextLine();
		// creates a new instance of list builder which is another method in the package
		ListBuilder lb = new ListBuilder();

		// calls a method at the bottom of this page that removes commas and spaces
		userInput=deLimiter(userInput);
		// function that looks through the string to determine lists or items
		for (int i =0; i < userInput.length(); i++)
		{
			if (userInput.charAt(i) == '(')
			{
				// calls method open bracket on the previously made listbuilder
				lb.buildOpenBracket();
			}
			else if (userInput.charAt(i) == ')')
			{
				// calls method close bracket on the previously made listbuilder
				lb.buildCloseBracket();
			}
			else
			{
				// calls method build element on the previously made listbuilder
				lb.buildElement((userInput.charAt(i)));
			}
		}
		// prints contents of the list
		lb.getList();
	
		// closes potential resource leak
		scanner.close();
	}
	
	// delimiter class made to remove spaces and commas
	public static String deLimiter(String userInput)
	{
		// temp string to be used for a string builder
		String temp = "";
		
		for (int i =0; i <userInput.length(); i++)
		{
			// checks for spaces and commas
			if (userInput.charAt(i) == ' ' || userInput.charAt(i) == ',' )
			{
				
			}
			// if isn't a space or comma it adds it to a new string
			else
			{
				temp+=userInput.charAt(i);
			}
		}
		// and returns the string with no commas or spaces
		return temp;
	}
}
