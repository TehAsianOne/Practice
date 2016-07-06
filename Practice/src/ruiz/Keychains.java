package ruiz;

import java.util.Scanner;

public class Keychains 
{

	private int currentQuantity;
	private int currentCost;

	public Keychains()
	{
		this.currentCost = 0;
		this.currentQuantity = 0;
	}

	public static void main(String[] args)
	{
		System.out.println("Ye Olde Keychain Shoppe\n");
		Keychains kc = new Keychains();
		boolean runState = true;
		Scanner input = new Scanner(System.in);
		kc.returnMenu();
		while(runState)
		{
			String answer = input.nextLine();
			if(answer.equals("1"))
			{
				System.out.println("How many keychains to add? You have " + kc.currentQuantity);
				int amount = input.nextInt();
				kc.addKeychains(kc, amount);
			}
			else if(answer.equals("2"))
			{
				System.out.println("How many keychains to remove? You have " + kc.currentQuantity);
				int amount = input.nextInt();
				kc.removeKeychains(kc, amount);
			}
			else if(answer.equals("3"))
			{
				System.out.println(kc.viewOrder(kc));
			}
			else if(answer.equals("4"))
			{
				kc.checkout(kc);
				runState = false;
			}
		}
		input.close();
	}

	private void returnMenu()
	{
		System.out.println("1. Add Keychains to Order\n2. Remove Keychains from Order\n3. View Current Order\n4. Checkout");
		System.out.println("");
	}

	private void addKeychains(Keychains kc, int amount)
	{
		int money = amount * 10;
		kc.currentQuantity += amount;
		kc.currentCost += money;

		System.out.println(kc.viewOrder(kc));
		
		kc.returnMenu();
	}

	private void removeKeychains(Keychains kc, int amount)
	{
		int money = amount * 10;
		kc.currentQuantity -= amount;
		kc.currentCost -= money;

		System.out.println(kc.viewOrder(kc));
		kc.returnMenu();
	}


	private String viewOrder(Keychains kc)
	{
		return "Current Quantity - " + kc.currentQuantity + "\nCurrent Cost - " + kc.currentCost;
	}

	private void checkout(Keychains kc)
	{
		System.out.println("Total for the order of " + kc.currentQuantity + " keychains: " + kc.currentCost);
	}
}
