package assign2;

import java.util.Scanner;

public class Assign2_9 {
		
	public Assign2_9()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the amount of water you would like to heat (L): ");
		
		double waterAmount = scanner.nextDouble();
		
		System.out.print("Enter the initial water temperature in C: ");
		
		double initTemp = scanner.nextDouble();
		
		System.out.print("Enter the final water temperature in C: ");
		
		double finalTemp = scanner.nextDouble();
		
		double energy = waterAmount * 4.186 * (finalTemp - initTemp);
		
		System.out.printf("Heating %.2f ml of water %.2f degrees C requires %.2f kilojoules of energy.", waterAmount, (finalTemp - initTemp), energy);
	}

}
