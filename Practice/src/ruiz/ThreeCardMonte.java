package ruiz;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		int answer = r.nextInt(3) + 1;
		Integer choice;
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.\n\nWhich one is the ace?\n");
		
		System.out.println("\t##  ##  ##");
		System.out.println("\t##  ##  ##");
		System.out.println("\t1   2   3 ");
		
		choice = scan.nextInt();
		
		if(choice.equals(answer))
		{
			System.out.println("\nYou got it! Fast Eddie gives you your winnings" + "\n");
			
			if(answer == 1)
			{
				System.out.println("\tAA  ##  ##");
				System.out.println("\tAA  ##  ##");
				System.out.println("\t1   2   3 ");
			}
			else if(answer == 2)
			{
				System.out.println("\t##  AA  ##");
				System.out.println("\t##  AA  ##");
				System.out.println("\t1   2   3 ");
			}
			else if(answer == 3)
			{
				System.out.println("\t##  ##  AA");
				System.out.println("\t##  ##  AA");
				System.out.println("\t1   2   3 ");
			}
			else
			{
				System.out.println("Some error occurred");
			}
		}
		else
		{
			System.out.println("\nHa! Fast Eddie wins again! The card was " + answer + "\n");
			
			if(answer == 1)
			{
				System.out.println("\tAA  ##  ##");
				System.out.println("\tAA  ##  ##");
				System.out.println("\t1   2   3 ");
			}
			else if(answer == 2)
			{
				System.out.println("\t##  AA  ##");
				System.out.println("\t##  AA  ##");
				System.out.println("\t1   2   3 ");
			}
			else if(answer == 3)
			{
				System.out.println("\t##  ##  AA");
				System.out.println("\t##  ##  AA");
				System.out.println("\t1   2   3 ");
			}
			else
			{
				System.out.println("Some error occurred");
			}
		}
		
	}
}