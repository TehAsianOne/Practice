package ruiz;

import java.util.*;

public class CountingMachine {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Count to: ");
		int answer = scan.nextInt();
		
		for(int x = 0; x < answer + 1; x++)
		{
			System.out.println(x);
		}
		scan.close();
	}
}
