package ruiz;

import java.util.Scanner;

public class Quiz
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int answer, counter;
		counter = 0;
		
		System.out.println("Are you ready for a quiz?");
		
		System.out.println("Who is an INT hero? ");
		System.out.println("1) Puck");
		System.out.println("2) Razor");
		System.out.println("3) Tiny");
		
		answer = scan.nextInt();
		if(answer == 1)
		{
			System.out.println("Correct!");
			counter++;
		}
		else
		{
			System.out.println("Nope!");
		}
		
		System.out.println("Which is the cheapest item? ");
		System.out.println("1) Heart of Terrasque");
		System.out.println("2) Force Staff");
		System.out.println("3) Stout Shield");
		answer = scan.nextInt();
		if(answer == 3)
		{
			System.out.println("Correct!");
			counter++;
		}
		else
		{
			System.out.println("Nope!");
		}
		
		System.out.println("Which hero CANNOT purge off effects? ");
		System.out.println("1) Oracle");
		System.out.println("2) Dazzle");
		System.out.println("3) Abaddon");
		answer = scan.nextInt();
		if(answer == 2)
		{
			System.out.println("Correct!");
			counter++;
		}
		else
		{
			System.out.println("Nope!");
		}
		
		System.out.println("Who is NOT considered an offlane hero? ");
		System.out.println("1) Centaur War Runner");
		System.out.println("2) Brood Mother");
		System.out.println("3) Zeus");
		answer = scan.nextInt();
		if(answer == 3)
		{
			System.out.println("Correct!");
			counter++;
		}
		else
		{
			System.out.println("Nope!");
		}
		
		System.out.println("Overall, you are " + counter + " out of 4");
	}
}