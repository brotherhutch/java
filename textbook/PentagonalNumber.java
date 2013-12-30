package textbook;

public class PentagonalNumber {
	
	public PentagonalNumber()
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.print(getPentagonalNumber(i) + " ");
			if(i % 10 == 0)
			{
				System.out.println();
			}
		}
	}
	
	public static int getPentagonalNumber(int n)
	{
		return n * (3 * n - 1) / 2;
	}
}
