package ruiz;

import java.util.Scanner;

public class AgeInFive
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age, ageFiveForward, ageFiveBackward;
		
		System.out.print("Hello. What is your name?");
		name = scan.next();
		System.out.print("Hi " + name + "! How old are you?");
		age = scan.nextInt();
		ageFiveForward = age + 5;
		ageFiveBackward = age - 5;
		System.out.println("Did you know that in five years you will be " + ageFiveForward + " years old?");
		System.out.println("And five years ago you were " + ageFiveBackward + "! Imagine that!");
		
		scan.close();
	}
}