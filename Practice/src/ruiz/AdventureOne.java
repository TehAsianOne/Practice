package ruiz;

import java.util.Scanner;

public class AdventureOne
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String answer;
		
		System.out.println("Welcome to my tiny adventure!\n");
		
		System.out.print("Alright, you're at the pick screen. Are you 'support' or 'carry'?");
		answer = scan.next();
		
		if(answer.equals("support"))
		{
			System.out.println("You immediately purchase all the wards and courier and head straight to the safelane.");
			System.out.print("Do you 'stack', or do you 'harass' the offlaner?");
			answer = scan.next();
			
			if(answer.equals("harass"))
			{
				System.out.println("The carry thanks you as it is now 5 minutes in the game, and that offlaner is still level 2.");
				System.out.print("Congrats!");
				
			}
			else if(answer.equals("stack"))
			{
				System.out.println("The carry thanks you as he now has 800 gpm when you take down the enemy ancient");
				System.out.print("Congrats!");
			}
		}
		else if(answer.equals("carry"))
		{
			System.out.println("You immediately purchase adequate regen and head straight to the safelane.");
			System.out.print("Do you 'farm' creeps, or do you 'kill' the offlaner?");
			answer = scan.next();
			
			if(answer.equals("farm"))
			{
				System.out.println("The team thanks you as you carry them to victory");
				System.out.print("Congrats!");
				
			}
			else if(answer.equals("kill"))
			{
				System.out.println("The offlaner gets the advantage, and you eventually lose");
				System.out.print("Congrats!");
			}
		}
		scan.close();
	}
}
