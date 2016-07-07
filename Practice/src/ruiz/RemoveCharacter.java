package ruiz;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class RemoveCharacter 
{
	public static void main(String[] args)
	{
		//User inputs a word, select what letter to remove

		//User will input string
		System.out.println("Enter a word: ");
		Scanner scan = new Scanner(System.in);
		String userString = scan.nextLine();

		//ask what letter to be removed

		System.out.print("Enter a character to remove: ");
		char letter = scan.next().charAt(0);
		char[] wordContainer = userString.toCharArray();


		System.out.println(wordContainer);
		String newWord;
		//remove letter
		
		for(int x = 0; x < userString.length() - 1; x++)
		{
			if(wordContainer[x] == letter)
			{
				String firstHalf = userString.substring(0, x);
				String secondHalf = userString.substring(x + 1, userString.length());
				
				newWord = firstHalf.concat(secondHalf);
				System.out.println(newWord);
			}
		}
		
		scan.close();
	}
	
	@Test
	public static void testValue()
	{
		assertEquals("String", "Strig");
	}
}
