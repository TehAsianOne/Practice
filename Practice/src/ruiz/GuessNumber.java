package ruiz;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random r = new Random();

		Integer answer;
		Integer max = 25;
		Integer correctAnswer = r.nextInt(max) + 1;
		int counter = 0;

		System.out.println("Warning: This is a bad guessing game\nAhem...\n");

		System.out.println("TEH WORS NUBMER GESSING GAME!!!1\ni'M THINK OF NUMBR 1-" + max +  ". TRY GUESS! ");
		answer = scan.nextInt();
		counter++;

		while(answer != correctAnswer)
		{
			System.out.println("LOL NO");
			answer = scan.nextInt();
			counter++;
		}

		System.out.println("Uh. Cool, you got it I guess. It took you " + counter + " tries.");


		scan.close();
	}
}