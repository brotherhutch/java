package exercises;

public class Assign1_7 {
	public Assign1_7()
	{
		// Approximate pi (4 x (1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 ….)
		
		// Gregory–Leibniz series
		
		double answer = 4.0;
		double numerator = 4.0;
		
		for(double i = 3, j = 3; i <= 1000001; i += 2, j++)
		{
			if(j % 2 != 0)
			{
				answer -= numerator / i;
			}
			else
			{
				answer += numerator / i;
				
			}
		}
		
		System.out.printf("An approximate value of pi is: %.5f", answer);

	}
}
