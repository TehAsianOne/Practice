package ruiz;

public class WhatIf
{
	public static void main(String[] args)
	{
		int people = 20;
		int cats = 30;
		int dogs = 15;
		
		if(people < cats)
		{	
			System.out.println("Too many cats! The world is fucked!");
		}
		if(people > cats)
		{	
			System.out.println("Not many cats! The world is okay I guess...");
		}
		if(people < dogs)
		{	
			System.out.println("The world is drooled on!");
		}
		if(people > dogs)
		{	
			System.out.println("The world is dry!");
		}
		
		dogs += 5;
		
		if(people >= dogs)
		{
			System.out.println("People are greater than or equal to dogs.");
		}
		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}
		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}