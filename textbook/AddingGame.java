package textbook;

import java.util.Scanner;

public class AddingGame {
	public AddingGame()
	{
		Scanner scanner = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		
		int answer = num1 + num2 + num3;
		
		System.out.printf("What is %d + %d + %d? ", num1, num2, num3);
		
		if(scanner.hasNextInt())
		{
			int guess = scanner.nextInt();
			
			if(guess == answer)
			{
				System.out.println("That is correct!");
			}
			else
			{
				System.out.println("Sorry, that is incorrect.");
			}
		}
		else
		{
			System.out.println("You must enter an integer.");
		}
	}
}
