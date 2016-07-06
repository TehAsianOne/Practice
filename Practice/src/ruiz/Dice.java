package ruiz;

import java.util.Random;

public class Dice
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int diceOne, diceTwo;
		
		System.out.println("Here comes the dice!");
		
		diceOne = r.nextInt(6) + 1;
		diceTwo = r.nextInt(6) + 1;
		
		System.out.println("Roll #1: " + diceOne);
		System.out.println("Roll #2: " + diceTwo);
		System.out.println("The total is " + (diceOne + diceTwo));
		
		while(diceOne != diceTwo)
		{
			diceOne = r.nextInt(6) + 1;
			diceTwo = r.nextInt(6) + 1;
			
			System.out.println("Roll #1: " + diceOne);
			System.out.println("Roll #2: " + diceTwo);
			System.out.println("The total is " + (diceOne + diceTwo));
		}
	}
}