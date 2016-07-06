package ruiz;

import java.util.Scanner;

public class TwoQuestions
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String answerSize, answerType, size, type;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.println("1) Is it an animal, vegetable, or mineral?");
		answerType = scan.next();
		
		System.out.println("2) Is it bigger than a breadbox?");
		answerSize = scan.next();
		
		if(answerSize.equals("no"))
		{
			if(answerType.equals("animal"))
			{
				System.out.println("Is it a squirrel?");
			}
			else if(answerType.equals("vegetable"))
			{
				System.out.println("Is it a carrot?");
			}
			else if(answerType.equals("mineral"))
			{
				System.out.println("Is it a paper clip?");
			}
		}
		else if(answerSize.equals("yes"))
		{
			if(answerType.equals("animal"))
			{
				System.out.println("Is it a moose?");
			}
			else if(answerType.equals("vegetable"))
			{
				System.out.println("Is it a watermelon?");
			}
			else if(answerType.equals("mineral"))
			{
				System.out.println("Is it a Camaro?");
			}
		}
		System.out.println("Eh, I don't really care");
		scan.close();
	}
}