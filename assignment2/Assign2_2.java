package assign2;

import java.util.Scanner;

public class Assign2_2 {

	public Assign2_2()
	{
		Scanner input = new Scanner(System.in);
		
		double cylinderRadius, cylinderLength, cylinderArea, cylinderVolume;
		
		System.out.println("Calculate area and volume of a Cylinder");
		System.out.println("---------------------------------------");
		
		// input
		System.out.print("Enter a radius: ");
		while(!input.hasNextDouble()) // check if a double was entered
		{
			System.out.print("Enter a radius: ");
			input.nextLine(); // advance the scanner past the problematic input
		}
		cylinderRadius = input.nextDouble();
		input.nextLine(); // advance scanner to ready for next input
		
		System.out.print("Enter a length: ");
		while(!input.hasNextDouble()) // check if a double was entered
		{
			System.out.print("Enter a length: ");
			input.nextLine(); // advance the scanner past the problematic input
		}
		cylinderLength = input.nextDouble();
		
		// process
		cylinderArea = Math.PI * Math.pow(cylinderRadius, 2);
		cylinderVolume = cylinderArea * cylinderLength;
		
		// output
		System.out.printf("The area of the cylinder is: %.2f\n", cylinderArea);
		System.out.printf("The volume of the cylinder is: %.2f\n", cylinderVolume);
		
		// clean up
		input.close();
	}
}
