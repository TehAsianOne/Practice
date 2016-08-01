package ruiz;

import java.util.HashMap;

public class StringPermutation 
{
	public static void main(String[] args) 
	{
		StringPermutation permutate = new StringPermutation();
		System.out.println(permutate.findPermutation("PianO", "OaniP"));
	}
	
	public boolean findPermutation(String stringOne, String stringTwo)
	{
		if(stringOne.length() != stringTwo.length())
		{
			return false;
		}
		
		boolean permutation = false;
		
		HashMap<Character, Integer> stringOneHash = new HashMap<>();
		
		for(int i = 0; i < stringOne.length(); i++)
		{
			stringOneHash.put(stringOne.charAt(i), 1);
		}
		
		for(int i = 0; i < stringTwo.length(); i++)
		{
			if(!stringOneHash.containsKey(stringTwo.charAt(i)))
			{
				permutation = false;
				break;
			}
			else
			{
				permutation = true;
			}
		}
		
		return permutation;
	}
}
