package ruiz;

import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String ansOne, ansTwo;
		
		System.out.print("Does it stay 'inside' or 'outside' or 'both'?");
		ansOne = scan.next();
		
		System.out.print("Is it a living thing? 'yes' or 'no'");
		ansTwo = scan.next();
		
		if(ansOne.equals("inside") && ansTwo.equals("yes"))
		{
			System.out.println("It's a houseplant!");
		}
		if(ansOne.equals("outside") && ansTwo.equals("yes"))
		{
			System.out.println("It's a bison!");
		}
		if(ansOne.equals("both") && ansTwo.equals("yes"))
		{
			System.out.println("It's a dog!");
		}
		
		if(ansOne.equals("inside") && ansTwo.equals("no"))
		{
			System.out.println("It's a shower curtain!");
		}
		if(ansOne.equals("outside") && ansTwo.equals("no"))
		{
			System.out.println("It's a billboard!");
		}
		if(ansOne.equals("both") && ansTwo.equals("no"))
		{
			System.out.println("It's a cell phone!");
		}
	}
}