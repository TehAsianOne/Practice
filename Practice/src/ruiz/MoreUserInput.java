package ruiz;

import java.util.Scanner;

public class MoreUserInput
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String firstName, lastName, login;
		int grade, studentNumber;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println();
		System.out.print("First name: ");
		firstName = scan.next();
		System.out.print("Last name: ");
		lastName = scan.next();
		System.out.print("Grade (9-12): ");
		grade = scan.nextInt();
		System.out.print("Student ID: ");
		studentNumber = scan.nextInt();
		System.out.print("Login: ");
		login = scan.next();
		System.out.print("GPA: ");
		gpa = scan.nextDouble();
		
		System.out.println();
		
		System.out.println("Your information: ");
		System.out.println("Login: " + login);
		System.out.println("ID: " + studentNumber);
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("GPA: " + gpa);
		System.out.println("Grade: " + grade);
	}
}