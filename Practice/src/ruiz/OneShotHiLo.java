package ruiz;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		int answer = r.nextInt(100) + 1;
		Integer choice;
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		choice = scan.nextInt();
		
		if(choice.equals(answer))
		{
			System.out.println("You guessed it correctly?!");
		}
		else if(choice < answer)
		{
			System.out.println("Wrong! You were too low. It was " + answer);
		}
		else if(choice > answer)
		{
			System.out.println("Wrong! You were too high. It was " + answer);
		}
		else
		{
			System.out.println("Something went wrong");
		}
		
	}
}