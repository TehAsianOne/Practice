package ruiz;

import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		PalindromeCheck check = new PalindromeCheck();
		check.FindPalindrome("goodd");
	}

	private void FindPalindrome(String string) 
	{
		HashMap<Character, Integer> letters = new HashMap<>();
		Stack stack = new Stack<>();
		StringBuffer word = new StringBuffer();
		int highestValue = 0;

		//Puts characters into hashmap containing letter and frequency
		for(int i = 0; i < string.length(); i++)
		{
			if(!letters.containsKey(string.charAt(i)))
			{
				letters.put(string.toLowerCase().charAt(i), 1);
			}
			else
			{
				letters.put(string.charAt(i), letters.get(string.charAt(i)) + 1);
			}
		}

		highestValue = Collections.max(letters.values());

		for(Character key : letters.keySet())
		{
			Integer value = letters.get(key);
			if(value == highestValue)
			{
				word.append(key);
				stack.add(key);
			}
		}
		
		for(Character key : letters.keySet())
		{
			Integer value = letters.get(key);
			if(value == 1) word.append(key);
		}
		
		for(int i = stack.size() - 1; i >= 0; i--)
		{
			word.append(stack.pop());
		}
		
		System.out.println(word);
		System.out.println(stack);
		System.out.println(highestValue);
		System.out.println(letters.toString());
	}
}
