package ruiz;

import java.util.ArrayList;

public class Schedule
{
	public static void main(String[] args)
	{
		ArrayList<String> classes = new ArrayList<String>();
		classes.add("CS 455");
		classes.add("CS 330");
		classes.add("FVA 364");
		classes.add("ART 254");
		
		ArrayList<String> teachers = new ArrayList<String>();
		teachers.add("Acker");
		teachers.add("Dormady");
		teachers.add("Kunzendorf");
		teachers.add("Smith");
		
		for(int x = 0; x < classes.size(); x++)
		{
			System.out.println(classes.get(x));
		}
		
		for(int x = 0; x < teachers.size(); x++)
		{
			System.out.println(teachers.get(x));
		}
	}
}