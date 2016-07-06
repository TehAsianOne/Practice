package ruiz;

public class MoreVariablesAndNames
{
	public static void main(String[] args)
	{
		String name, eyes, teeth, hair;
		int age, heightInches, weightLbs;
		double heightCm, weightKg;
		
		name = "Zed A. Shaw";
		age = 35;
		heightInches = 74;
		weightLbs = 180;
		heightCm = heightInches * 2.54;
		weightKg = weightLbs * .453592;
		eyes = "Blue";
		teeth = "White";
		hair = "Brown";
		
		System.out.println("Let's talk about " + name + ".");
		System.out.println("He's " + heightInches + " inches tall, " + heightCm + " cm tall");
		System.out.println("He's " + weightLbs + " pounds heavy, " + weightKg + " kg heavy");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + eyes + " eyes and " + hair + " hair");
		System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
		System.out.println("If I add " + age + ", " + heightInches + ", and " + weightLbs + ", I get " + (age + heightInches + weightLbs) + ".");
	}
}