package textbook;

public class PosNegAvg {
	
	public PosNegAvg(String[] args)
	{
		// check if input is empty
		if(args.length < 1)
		{
			System.out.printf("This program requires input, ending with 0. Example: java %s 1 4 5 0", this.getClass().getSimpleName());
		}
		
		int i = 0;
		int sum = 0;
		int num = 1;
		int positives = 0;
		int negatives = 0;
		while(num != 0)
		{
			// end the program if user forgot to enter '0'
			if(i == args.length)
			{
				System.out.printf("This program requires that the last input is 0. Example: java %s 1 4 5 0", this.getClass().getSimpleName());
				System.exit(0);
			}
			
			// check if string data is numeric
			if(!args[i].matches("^-?\\d+$"))
			{
				// data is not numeric
				System.out.printf("This program requires numeric input, ending with 0. Example: java %s 1 4 5 0", this.getClass().getSimpleName());
				System.exit(0);
			}
			
			// data is numeric; safe to convert
			num = Integer.parseInt(args[i]);
			positives += (num > 0) ? 1 : 0;
			negatives += (num < 0) ? 1 : 0;
			sum += num;
			 
			i++;
		}
		
		double avg = (double)sum / (i - 1); // cast prevents result from being generated as integer
		
		System.out.printf("The number of positives is: %d\n", positives);
		System.out.printf("The number of negatives is: %d\n", negatives);
		System.out.printf("The total is: %d\n", sum);
		System.out.printf("The average is: %.2f\n", avg);
	}

}
