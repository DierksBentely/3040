/* 	Graham Pomfret
	0595995
	COIS 3040 Assignment 2
	
	This is a program that will take a string input as follows
	It will check if it is 
	read	- which will display the value of content in RealText through the proxy to the console
	write	- which will allow the manipulation of the content in RealText through a proxy
	both	- which will allow the manipulation of the content then display it to the console
*/
package assignment2q2;

import java.util.Scanner;

public class Main 
{
	// main method
	public static void main(String[] args)
	{
		// sets up scanner to take user input
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		// sets up the proxy version of text
		ProxyText prox = new ProxyText();
		// while loop that will allow multiple operations on the text
		while(!userInput.equals("exit"))
		{
			System.out.println("read, write or both? or exit to close program");
			// overwrites value in userinput
			userInput = scan.next();
			// checks for read
			if(userInput.equals("read"))
			{
				// prints the value of real text to the screen
				prox.displayText();
			}
			// checks for write
			else if (userInput.equals("write"))
			{
				System.out.print("rewrite with: ");
				userInput=scan.next();
				// overwrites the value in real text with with userInput
				prox.editText(userInput);
			}
			// overwrites the value in real text with with userInput
			else if(userInput.equals("both"))
			{
				System.out.print("rewrite with: ");
				userInput=scan.next();
				// through the proxy method readWrite
				prox.readWrite(userInput);
			}
			// user exits
			else if(userInput.equals("exit"))
			{
				System.out.println("Have a nice day");
			}
		}
		
		// closes scanner and resource leak
		scan.close();
	}
}
