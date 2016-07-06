package ruiz;

import java.util.Scanner;

public class NameAgeSalary
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.println("Hello, what is your name?");
		name = scan.next();
		
		System.out.println("Hi, " + name + "! How old are you?");
		age = scan.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name + "?");
		salary = scan.nextDouble();
		
		System.out.println(salary + "! I hope that's per hour and not per year! LMAO!");
	}
}