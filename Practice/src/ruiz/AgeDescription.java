package ruiz;

import java.util.Scanner;

public class AgeDescription
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Hey, what's your name? ");
		name = scan.next();
		System.out.print("Ok, " + name + ", How old are you? ");
		age = scan.nextInt();
		
		System.out.println();
		
		if(age < 16)
		{
			System.out.println("LOL you can't drive.");
		}
		if(age < 18)
		{
			System.out.println("ROFL you can't vote.");
		}
		if(age < 25)
		{
			System.out.println("LMAO you can't rent a car.");
		}
		if(age >= 25)
		{
			System.out.println("AYYY you can do anything that's legal.");
		}
		scan.close();
	}
}