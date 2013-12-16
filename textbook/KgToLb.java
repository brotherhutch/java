package textbook;

public class KgToLb {

	public KgToLb() 
	{
		int kgs = 1;
		double lbs = 0;
		System.out.printf("%-15s%-15s%n","Kilograms", "Pounds");
		while(kgs < 200)
		{
			lbs = kgs * 2.2;
			System.out.printf("%-15d%-15.1f%n", kgs, lbs);
			kgs += 2;
		}
	}
}
