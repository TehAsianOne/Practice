package ruiz;

import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double numOne, numTwo, numThree, answer;
		
		System.out.print("What is your first number? ");
		numOne = scan.nextDouble();
		System.out.print("What is your second number? ");
		numTwo = scan.nextDouble();
		System.out.print("What is your third number? ");
		numThree = scan.nextDouble();
		
		System.out.println();
		
		answer = (numOne + numTwo + numThree) / 2;
		
		System.out.println("(" + numOne + " + " + numTwo + " + " + numThree + ") / 2 is..." + answer);
	}
}