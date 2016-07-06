package ruiz;

import java.util.Scanner;

public class GenderGame
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String gender, firstName, lastName, married;
		int age;
		
		System.out.print("What is your gender (m or f) ");
		gender = scan.next();
		
		System.out.print("What is your first name? ");
		firstName = scan.next();
		
		System.out.print("What is your last name? ");
		lastName = scan.next();
		
		System.out.print("Age? ");
		age = scan.nextInt();
		
		if(gender.equals("f") && age > 20)
		{
			System.out.print("Are you married? (y or n) ");
			married = scan.next();
			if(married.equals("y"))
			{
				System.out.print("Then I shall call you Mrs. " + lastName + ".");
			}
			else if(married.equals("n"))
			{
				System.out.print("Then I shall call you Ms. " + lastName + ".");
			}
		}
		if(gender.equals("f") && age < 20)
		{
			System.out.print("Then I shall call you " + firstName + " " + lastName + ".");
		}
		
		if(gender.equals("m") && age < 20)
		{
			System.out.print("Then I shall call you " + firstName + " " + lastName + ".");
		}
		if(gender.equals("m") && age > 20)
		{
			System.out.print("Then I shall call you Mr. " + lastName + ".");
		}
	}
}