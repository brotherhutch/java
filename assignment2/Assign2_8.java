package assign2;

import java.util.Scanner;

public class Assign2_8 {
	
	public Assign2_8()
	{
		System.out.println("Acceleration Calculator");
		System.out.println("-----------------------");
		System.out.println("");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter starting velocity in meters per second: ");
		double inputStartVelocityMetersPerSecond = scanner.nextDouble();
		
		System.out.print("Enter ending velocity in meters per second: ");
		double inputEndVelocityMetersPerSecond = scanner.nextDouble();
		
		System.out.print("Enter duration of motion in seconds: ");
		double inputDurationSeconds = scanner.nextDouble();
		
		double acceleration = (inputEndVelocityMetersPerSecond - inputStartVelocityMetersPerSecond) / inputDurationSeconds;
		
		System.out.printf("The average acceleration in meters per second is %.2f", acceleration);
		
		scanner.close();
	}
}
