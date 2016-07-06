package ruiz;

import java.util.*;

public class List 
{
	public static void main(String[] args)
	{
		LinkedList<LinkedListItem> stuff = new LinkedList<>();
		stuff.add(new LinkedListItem(1, "Yes"));
		stuff.add(new LinkedListItem(2, "No"));
		
		//System.out.println(stuff.toString());
		
		Stack<LinkedListItem> stack = new Stack<>();
		stack.push(new LinkedListItem(1, "Yes"));
		stack.push(new LinkedListItem(2, "No"));
		stack.push(new LinkedListItem(3, "Maybe"));
		
		/*System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());*/
		
		Hashtable<Integer, String> testing = new Hashtable<>();
		
		testing.put(1, "Yes");
		testing.put(2, "No");
		testing.put(3, "Maybe");
		
		//System.out.println(testing.get(2));
		
		HashMap<Integer, String> testing2 = new HashMap<>();
		
		testing2.put(1, "Yes");
		
		//System.out.println(testing2.get(1));
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		
	}
}
