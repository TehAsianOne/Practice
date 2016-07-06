package ruiz;

import java.util.*;

public class SafeSquareRoot 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		double input;
		
		System.out.println("Square root!");
		System.out.println("Enter a number: ");
		input = scan.nextDouble();
		
		while(input < 0)
		{
			System.out.println("You've entered a negative number, try again.");
			System.out.println("Enter a number: ");
			input = scan.nextInt();
		}
		
		double answer = Math.sqrt(input);
		System.out.println(input + " squared = " + answer);
	}
}
