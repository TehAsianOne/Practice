package ruiz;

import java.util.Scanner;

public class CompareTo
{
	public static void main(String[] args)
	{
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int i = "axe".compareTo("dog");
		System.out.println(i);

		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println( "applebee's".compareTo("apple") );
		
		System.out.print("Comparing \"Wrecked\" with \"shipwreck\" produces ");
		System.out.println( "Wrecked".compareTo("shipwreck") );
		
		System.out.print("Comparing \"mouse\" with \"moose\" produces ");
		System.out.println( "mouse".compareTo("moose") );
		
		System.out.print("Comparing \"cheer\" with \"cherry\" produces ");
		System.out.println( "cheer".compareTo("cherry") );
	}
}