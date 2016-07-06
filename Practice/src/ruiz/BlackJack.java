package ruiz;

import java.util.*;

public class BlackJack 
{
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to a game a BlackJack");
		
		//Generates cards for both players
		int userCardOne, userCardTwo, dealerCardOne, dealerCardTwo, userTotal, dealerTotal;
		userCardOne = generateCard();
		userCardTwo = generateCard();
		dealerCardOne = generateCard();
		dealerCardTwo = generateCard();
		
		userTotal = userCardOne + userCardTwo;
		dealerTotal = dealerCardOne + dealerCardTwo;
		
		int userCardAdd = 0;
		int dealerCardAdd = 0;
		
		//Just checking card values
		System.out.println(userCardOne);
		System.out.println(userCardTwo);
		System.out.println(dealerCardOne);
		System.out.println(dealerCardTwo);
		System.out.println();
		
		//Displays info
		System.out.println("You recieve: " + userCardOne + " and " + userCardTwo);
		System.out.println("Your total is " + userTotal);
		System.out.println("Dealer has a " + dealerCardOne + " and a hidden card");
		
		System.out.println("Would you like to 'hit' or 'stay'?");
		String answer = scan.nextLine();
		
		while(!answer.equals("stay"))
		{
			if(answer.equals("hit"))
			{	
				userCardAdd = generateCard();
				System.out.println(userCardAdd);
				userTotal += userCardAdd;
				System.out.println("Total is now " + userTotal);
				
				if(userTotal <= 21)
				{
					System.out.println("Would you like to 'hit' or 'stay'?");
					answer = scan.nextLine();
				}
				else
				{
					System.out.println("You went over!");
					break;
				}
			}
		}
		
		System.out.println("You stick with " + userTotal + ". Dealer's turn");
		
		System.out.println("His hidden card was " + dealerCardTwo + " for a total of " + dealerTotal);
		answer = "hit";
		
		while(!answer.equals("stay") || dealerTotal < userTotal)
		{
			if(answer.equals("hit"))
			{	
				dealerCardAdd = generateCard();
				System.out.println(dealerCardAdd);
				dealerTotal += dealerCardAdd;
				System.out.println("Dealer total is now " + dealerTotal);
				
				if(dealerTotal <= 21)
				{
					if(dealerTotal < userTotal)
					{
						answer = "hit";
					}
					else
					{
						answer = "stay";
						break;
					}
				}
				else
				{
					System.out.println("Dealer went over!");
					break;
				}
			}
		}
		
		if(userTotal > dealerTotal)
		{
			System.out.println("You win!");
		}
		else if(dealerTotal > userTotal)
		{
			System.out.println("You lose!");
		}
		else
		{
			System.out.println("It is a draw!");
		}
		
		scan.close();
	}
	
	public static int generateCard()
	{
		Random r = new Random();
		return r.nextInt(11) + 1;
	}
}
