package ruiz;

import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String answer;
		
		System.out.print("What's your last name? ");
		answer = scan.next();
		
		if(answer.compareTo("Carswell") <= 0)
		{
			System.out.println("You don't have to wait that long");
		}
		else if(answer.compareTo("Jones") <= 0)
		{
			System.out.println("That's not bad");
		}
		else if(answer.compareTo("Smith") <= 0)
		{
			System.out.println("Looks like a bit of a wait");
		}
		else if(answer.compareTo("Young") <= 0)
		{
			System.out.println("It's gonna be a while");
		}
		else if(answer.compareTo("Young") > 0)
		{
			System.out.println("Not going anywhere for a while");
		}
	}
	
}
	