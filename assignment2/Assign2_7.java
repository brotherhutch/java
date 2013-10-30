package assign2;

import javax.swing.JOptionPane;

public class Assign2_7 {
	
	public Assign2_7()
	{
		String inputMinutes = JOptionPane.showInputDialog(null, "Enter a number of minutes", "Minutes to Years and Days", JOptionPane.PLAIN_MESSAGE);
		int minutes = 0;
		
		try
		{
			minutes = Integer.parseInt(inputMinutes);
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "You must enter a number", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		int hours = minutes / 60;
		int days = hours / 24;
		int years = days / 365;
		days = days % 365;
		
		JOptionPane.showMessageDialog(null, String.format("That many minutes is equivalent to %d year(s) and %d day(s)", years, days), "Answer", JOptionPane.PLAIN_MESSAGE);
	}

}
