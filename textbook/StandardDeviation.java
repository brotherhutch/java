package textbook;

import javax.swing.JOptionPane;

public class StandardDeviation {
	
	public StandardDeviation()
	{
		double number = 0.0;
		int numbersIndex = 0;
		double[] numbers = new double[10];
		double sum = 0.0;
		double average = 0.0;
		double deviation = 0.0;
		double deviationSum = 0.0;
		
		String numbersInput = JOptionPane.showInputDialog(null, "Enter 10 numbers separated by spaces", "Standard Deviation", JOptionPane.PLAIN_MESSAGE);
		
		String[] numbersString = numbersInput.split(" ");
		
		// validate input
		if(numbersString.length != 10)
		{
			JOptionPane.showMessageDialog(null, "You must enter 10 numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		for(String numberString : numbersString)
		{
			try
			{
				number = Double.parseDouble(numberString);
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "You must enter numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
			sum += number;
			numbers[numbersIndex++] = number;
		}
		
		// find mean
		average = sum / numbers.length;
		
		// find deviation
		for(double numberDev : numbers)
		{
			deviationSum += Math.pow((numberDev - average),2);
		}
		
		deviation = Math.sqrt(deviationSum / (numbers.length - 1));
		
		String resultString = String.format("The average is: %.2f%nThe deviation is %.5f%n", average, deviation);
		JOptionPane.showMessageDialog(null, resultString, "Result", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
