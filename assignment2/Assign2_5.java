package assign2;

import java.util.Scanner;

public class Assign2_5 {
	
	public Assign2_5()
	{
		Scanner scanner = new Scanner(System.in);
		double subtotal = 0;
		double gratuityRate = 0;
		double gratuity = 0;
		double total = 0;
		String inputData = "";
		// this initial array size doesn't actually matter since split will overwrite it
		String[] inputDataParts = new String[2]; 

		System.out.print("Enter the subtotal and desired gratuity separated by a comma (e.g. 60.15, 15): ");
		
		inputData = scanner.next();
		
		if(inputData.contains(","))
		{
			inputDataParts = inputData.split(",");
		}
		else
		{
			System.out.println("You must enter two values separated by a comma");
			System.exit(0);
		}
		
		try
		{
			subtotal = Double.parseDouble(inputDataParts[0].trim());
			gratuityRate = Double.parseDouble(inputDataParts[1].trim());
		}
		catch(Exception ex)
		{
			System.out.println("Invalid input: you must enter two numbers separated by a comma");
			System.exit(0);
		}
		
		gratuity = subtotal * (gratuityRate / 100);
		total = subtotal + gratuity;
		
		System.out.printf("The gratuity is $%.2f and the total is $%.2f", gratuity, total);
		
	}

}
