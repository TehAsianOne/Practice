package ruiz;

import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double heightM, heightIN, weightKG, weightLBS, bmi;
		
		System.out.print("Your height in m = ");
		heightM = scan.nextDouble();
		System.out.println("Your weight in kg = ");
		weightKG = scan.nextDouble();
		
		bmi = weightKG / (heightM * heightM);
		System.out.println("Your BMI is " + bmi);
		
		System.out.println("Nice! Let's use different conversions!");
		System.out.print("Your height in inches = ");
		heightIN = scan.nextDouble();
		System.out.print("Your weight in pounds = ");
		weightLBS = scan.nextDouble();
		
		heightM = heightIN * .0254;
		weightKG = weightLBS * 2.204;
		
		System.out.println("Your BMI is now " + bmi);
	}
}