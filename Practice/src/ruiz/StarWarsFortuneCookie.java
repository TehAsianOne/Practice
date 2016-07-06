package ruiz;

import java.util.Random;

public class StarWarsFortuneCookie
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		Integer fortune = r.nextInt(6) + 1;
		
		String lotto = "";
		
		if(fortune.equals(1))
		{
			System.out.println("Why did the Empire destroy Leia's home world?\nI don't know, but it was for ALDERAAN reasons\n");
		}
		else if(fortune.equals(2))
		{
			System.out.println("What does Obi-wan's master drink?\nQui-Gon GIN\n");
		}
		else if(fortune.equals(3))
		{
			System.out.println("How do Imperial Forces get around the Death Star?\nThey take the ELE-VADER\n");
		}
		else if(fortune.equals(4))
		{
			System.out.println("Why did the Sith Lord cross the road?\nTo get to the DARK SIDE\n");
		}
		else if(fortune.equals(5))
		{
			System.out.println("What is a Jedi's favorite medieval weapon?\nMACE Windu\n");
		}
		else if(fortune.equals(6))
		{
			System.out.println("What is Anakin Skywalker's favorite book?\nENDORS Game\n");
		}
		else
		{
			System.out.println("Something got messed up");
		}
		
		System.out.println("Here are your lotto numbers!");
		
		System.out.println(r.nextInt(54 + 1) + " " + r.nextInt(54 + 1) + " " + r.nextInt(54 + 1) + " " + r.nextInt(54 + 1) + " " + r.nextInt(54 + 1) + " " + r.nextInt(54 + 1));
	}
}