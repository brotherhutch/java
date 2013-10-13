package assign2;

import java.util.Scanner;

public class Assign2_1 {

	public Assign2_1()
	{
		Scanner input = new Scanner(System.in);

		double c = 0;
		double f = 0;
		String again = "y";


		while(again.equals("y"))
		{
			System.out.print("Enter a celsius value to convert it to Fahrenheit: ");
			try{
				c = input.nextDouble();
			}
			catch(Exception ex)
			{
				System.out.println("You must enter a number.");
				System.exit(1);
			}
			f = ((c * 9 / 5) + 32);
			System.out.printf("Sweet! The Fahrenheit conversion is: %.1f\n", f);

			System.out.print("Again (y/n)? ");
			
			again = input.next().toLowerCase();
		}
		
		input.close();

	}
}
