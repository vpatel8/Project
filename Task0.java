
/*
 * Fix me! All sorts of bugs are here...
 * Also, make this class pass all its tests from P1Tests.java
 * Without modifying the relevant test in P1Tests.java
 */

/*
 * We make a class to hold our main method. We can't avoid it in Java.
 */

public class Task0 
{
	
	/* 
	 * We write a main method, describing what calculation to perform when the program runs. 
	 * All it does is call lowest() as an example usage.
	 *
	public static void main(String[] args)
	{
		// Let's test out our lowest() method below on the first ten positive ints.
		int toTen = lowest(1,10);
		// Let's print out what the value is politely.
		System.out.println("Smallest # divisible by 1 through 10 is " + toTen);
	}*/

	/*
	 * This method will find the lowest *positive* number that's divisible by 1 through 10.
	 * @param lower_limit   the lowest  integer that must divide the answer.
	 * @param upper_limit   the highest integer that must divide the answer.
	 * @return the smallest positive int that's divisible by all numbers from lower_limit to upper_limit inclusive.
	 */
	public static int lowest(int lower_limit, int upper_limit)
	{
		// Find the lowest *positive* number that's divisible by all integers lower_limit through upper_limit.
		boolean found = false;
		// Let's start with the upper limit as our first candidate.
		int n = upper_limit;
		// Let's keep looking until we find such a number. Clearly 10 not would work though probably it isn't smallest, so this loop must end.
		while (!found) 
		{
			//Is this current attempt okay so far? Let's assume so until we find out otherwise.
			boolean okay = true;
			// try each possible divisor.
			for (int i=lower_limit; i<= upper_limit; i++) 
			{
				// If there's a non-divisor found in the given range, this is not an okay candidate answer, and we should break out of the for-loop.
				if (i/n != (n%i))
				{
					okay = false;
					break;
				}
			}
			// If answer found, then we're ready to quit the while-loop as well.
			if (okay)
			{
				found = true;
			}
			// If we haven't found it yet, let's increment and try again...
			else
			{
				n++;
			}
		}
		// return out answer.
		return n;
	}
}
