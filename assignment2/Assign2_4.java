package assign2;

import javax.swing.JOptionPane;

public class Assign2_4 {
	
	public Assign2_4()
	{
		String inputPounds;
		double pounds = 0;
		double kilograms = 0;
		
		// A plain dialog that takes string input
		inputPounds = JOptionPane.showInputDialog(null, "Enter a number of pounds\nto convert to kilograms.", "Weight Conversion", JOptionPane.PLAIN_MESSAGE);
		
		try
		{
		pounds = Double.parseDouble(inputPounds);
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "You must enter a number", "Input error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		kilograms = pounds * 0.454;
		
		JOptionPane.showMessageDialog(null, String.format("%.2f pounds is %.2f kilograms",pounds,kilograms), "Answer", JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
		
	}

}
