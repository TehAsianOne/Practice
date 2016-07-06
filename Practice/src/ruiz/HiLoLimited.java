package ruiz;

import java.util.Scanner;
import java.util.Random;

public class HiLoLimited 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		int guess;
		int counter = 0;
		int number = r.nextInt(100) + 1; 
		
		System.out.println("I'm thinking of a number between 1 and 100. You have 7 tries" + number);
		System.out.println("First guess: ");
		
		guess = scan.nextInt();
		counter++;
		
		while(guess != number && counter < 7)
		{
			if(guess < number)
			{
				System.out.println("Wrong, you were too low. Guess again.");
				System.out.println("Guess " + (counter + 1) + ": ");
				guess = scan.nextInt();
				counter++;
			}
			else if(guess > number)
			{
				System.out.println("Wrong, you were too high. Guess again.");
				System.out.println("Guess " + (counter + 1) + ": ");
				guess = scan.nextInt();
				counter++;
			}
		}
		
		if(guess == number)
		{
			System.out.println("Correct, it took you " + counter + " tries to get " + number);
		}
		else 
			System.out.println("Took you too long");
		
		scan.close();
	}
}
