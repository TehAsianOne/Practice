package ruiz;

import java.util.Scanner;

public class ForgetfulMachine//Doesn't do shit rofl
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me a word!");
		scan.next();
		System.out.println("Give me a second word!");
		scan.next();
		System.out.println();
		System.out.println("Great, now your favorite number?");
		scan.next();
		System.out.println("And your second-favorite number...");
		scan.next();
		System.out.println("Whew, wasn't that fun?");
	}
}
