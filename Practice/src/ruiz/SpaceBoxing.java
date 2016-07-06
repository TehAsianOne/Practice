package ruiz;

import java.util.Scanner;

public class SpaceBoxing
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double weight, calcWeight;
		int selection;
		
		System.out.print("Please enter your current earth weight: ");
		weight = scan.nextDouble();
		
		System.out.println("\nI have information for the following planets: ");
		System.out.print("\t1. Venus\t2. Mars\t   \t3. Jupiter\n");
		System.out.print("\t4. Saturn\t5. Uranus\t6. Neptune\n");
		
		System.out.print("Which planet are you visiting? (Number) ");
		selection = scan.nextInt();
		
		if(selection == 1)
		{
			calcWeight = weight * .78;
			System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
		}
		else if(selection == 2)
		{
			calcWeight = weight * .39;
			System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
		}
		else if(selection == 3)
		{
			calcWeight = weight * 2.65;
			System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
		}
		else if(selection == 4)
		{
			calcWeight = weight * 1.17;
			System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
		}
		else if(selection == 5)
		{
			calcWeight = weight * 1.05;
			System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
		}
		else if(selection == 6)
		{
			calcWeight = weight * 1.23;
			System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
		}
		else
		{
			System.out.println("I don't know what you're saying dude");
		}
	}
}