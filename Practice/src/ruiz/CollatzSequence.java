package ruiz;

import java.util.*;

public class CollatzSequence 
{
	public static void main(String []args)
	{
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		int number = r.nextInt(1000) + 1;
		int counter = 0;
		int highest = number;
		
		System.out.println("Starting Number: " + number);
		while(number != 1)
		{
			if(number % 2 == 0)
			{
				if(number > highest)
				{
					highest = number;
				}
				number = number / 2;
				System.out.print(number + "\t");
				counter++;
			}
			else if(number % 2 != 0)
			{
				if(number > highest)
				{
					highest = number;
				}
				number = (number * 3) + 1;
				System.out.print(number + "\t");
				counter++;
			}
		}
		System.out.println();
		System.out.println("Took " + counter + " tries. Highest value was: " + highest);
	}
}
