package ruiz;

import java.util.Scanner;

public class AgeMessage
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Enter your name: ");
		name = scan.next();
		
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		
		if(age < 16)
		{
			System.out.println("LOL You can't drive");
		}
		
		if(age >=16 && age < 18)
		{
			System.out.println("ROFL You can drive, but not vote");
		}
		
		if(age >=18 && age < 25)
		{
			System.out.println("LMAO You can vote, but not rent a car");
		}
		
		if(age >= 25)
		{
			System.out.println("AYYY You can do whatever");
		}
		
		scan.close();
	}
}