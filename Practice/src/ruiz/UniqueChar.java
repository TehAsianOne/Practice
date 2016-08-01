package ruiz;

import java.util.HashMap;

public class UniqueChar 
{
	public static void main(String[] args) 
	{
		UniqueChar find = new UniqueChar();
		
		System.out.println(find.findDuplicate("gtryh"));
	}
	
	public boolean findDuplicate(String str)
	{
		boolean duplicate = false;
		HashMap<Character, Integer> uniqueMap = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++)
		{
			if(!uniqueMap.containsKey(str.charAt(i)))
			{
				uniqueMap.put(str.charAt(i), 1);
			}
			else
			{
				duplicate = true;
				break;
			}
		}
		
		return duplicate;
	}
}
