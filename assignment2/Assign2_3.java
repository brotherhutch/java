package assign2;

import java.util.Scanner;

public class Assign2_3 {
	
	public Assign2_3()
	{
		Scanner scanner = new Scanner(System.in);
		double inputFeet = 0;
		double outputMeters = 0;
		
		System.out.print("Enter the number of feet to convert to meters: ");
		
		// This is a good way to avoid generating an exception
		// Check if double has been entered before assignment
		if(scanner.hasNextDouble())
		{
			inputFeet = scanner.nextDouble();
		}
		else
		{
			System.out.println("You must enter a number.");
			System.exit(0);
		}
		
		outputMeters = inputFeet * 0.305;
		
		System.out.printf("%.2f feet is %.2f meters.", inputFeet, outputMeters);
		
	}

}
