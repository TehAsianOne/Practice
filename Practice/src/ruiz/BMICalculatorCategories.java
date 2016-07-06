package ruiz;

import java.util.Scanner;

public class BMICalculatorCategories
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double heightM, heightIN, weightKG, weightLBS, bmi;
		String category;
		
		System.out.print("Your height in m = ");
		heightM = scan.nextDouble();
		System.out.println("Your weight in kg = ");
		weightKG = scan.nextDouble();
		
		bmi = weightKG / (heightM * heightM);
		System.out.println("Your BMI is " + bmi);
		
		/*System.out.println("Nice! Let's use different conversions!");
		System.out.print("Your height in inches = ");
		heightIN = scan.nextDouble();
		System.out.print("Your weight in pounds = ");
		weightLBS = scan.nextDouble();
		
		heightM = heightIN * .0254;
		weightKG = weightLBS * 2.204;
		
		System.out.println("Your BMI is now " + bmi);*/
		
		if(bmi < 15)
		{
			System.out.println("BMI Category: Very severely underweight");
		}
		if(bmi >= 15 && bmi <= 16)
		{
			System.out.println("BMI Category: Severely underweight");
		}
		if(bmi >= 16.1 && bmi <= 18.4)
		{
			System.out.println("BMI Category: Underweight");
		}
		if(bmi >= 18.5 && bmi <= 24.9)
		{
			System.out.println("BMI Category: Normal Weight");
		}
		if(bmi >= 25 && bmi <= 29.9)
		{
			System.out.println("BMI Category: Overweight");
		}
		if(bmi >= 30 && bmi <= 34.9)
		{
			System.out.println("BMI Category: Moderately Obese");
		}
		if(bmi >= 35 && bmi <= 39.9)
		{
			System.out.println("BMI Category: Severely Obese");
		}
		if(bmi >= 40)
		{
			System.out.println("BMI Category: Morbidly Obese");
		}
	}
}