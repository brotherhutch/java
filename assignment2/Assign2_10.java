package assign2;

import java.util.Scanner;

public class Assign2_10 {
	
	public Assign2_10()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the plane's take-off velocity (m/s): ");
		
		double velocity = scanner.nextDouble();
		
		System.out.print("Enter the plane's acceleration (m/s^2): ");
		
		double acceleration = scanner.nextDouble();
		
		double runwayLength = velocity * velocity / 2 * acceleration;
		
		System.out.printf("The runway needs to be %.2f m long for this plane to take off safely", runwayLength);
	}

}
