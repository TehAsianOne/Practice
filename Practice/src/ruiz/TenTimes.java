package ruiz;

import java.util.*;

public class TenTimes {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("I will type the following sentence 10 times.");
		String answer = scan.next();
		
		for(int x = 0; x < 10; x++)
		{
			System.out.println(answer);
		}
		scan.close();
	}
}
