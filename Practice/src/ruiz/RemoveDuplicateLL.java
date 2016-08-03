package ruiz;

import java.util.HashMap;
import java.util.LinkedList;

public class RemoveDuplicateLL 
{
	public static void main(String[] args)
	{
		RemoveDuplicateLL remove = new RemoveDuplicateLL();
		LinkedList<String> list = new LinkedList<>();
		
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yo");
		list.add("yo");
		list.add("yo");
		list.add("yo");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yo");
		list.add("yo");
		list.add("yo");
		list.add("yo");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		list.add("yes");
		list.add("no");
		list.add("maybe");
		list.add("so");
		list.add("yes");
		list.add("maybe");
		
		System.out.println(list);
		
		remove.RemoveDuplicates(list);
		
		System.out.println(list);
	}

	private void RemoveDuplicates(LinkedList<String> list) 
	{
		HashMap<String, Integer> unique = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			if(!unique.containsKey(list.get(i)))
			{
				unique.put(list.get(i), 1);
			}
			else
			{
				list.remove(i);
				i--;
			}
		}
	}	
}
