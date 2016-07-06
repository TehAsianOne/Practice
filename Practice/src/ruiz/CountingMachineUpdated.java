package ruiz;

import java.util.*;

public class CountingMachineUpdated {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int countFrom = 0;
		int countTo = 0;
		int countBy = 0;
		
		System.out.println("Count from: ");
		countFrom = scan.nextInt();
		
		System.out.println("Count to: ");
		countTo = scan.nextInt();
		
		System.out.println("Count by: ");
		countBy = scan.nextInt();
		
		//System.out.println(countFrom + " " + countTo + " " + countBy);
		
		for(int x = 0 ; x < countTo; countBy++)
		{
			System.out.println(x);
		}
	}
}
