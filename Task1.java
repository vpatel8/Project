/*
 * Made a main method
 */
public class Task1 
{
	/*
	/* 
	 * Write a main method, describing what to perform when the program runs. 
	 *
	public static void main(String[] args) throws Exception
	{
		System.out.println("A 93 gets you a(n) " + letterGrade(93) + ".");
		System.out.println("sum56Multiples(20) = " + sum56Multiples(17));
		System.out.println("sumSquares(0,10) = " + sumSquares(1,11));
		System.out.println("gcd(150, 60) = " + gcd(150,60));
		System.out.println("sumOdds(new int[]{1,2,3,4,5,6}) = " + sumOdds(new int[]{1,2,3,4,5,6}));
		System.out.println("sumTwoLowest(new int[]{5,4,3,2,1}) = " + sumTwoLowest(new int[]{5,4,3,2,1}));
	}*/
	/* 
	 * Letter grade calculator accepts integer score (expected from 0 to 100)
	 * returns string describing grade.
	 * @param score int (assumed to be from 0 to 100)
	 * @return string representing the letter grade, with +/-
	 */
	public static String letterGrade(int score)
	{
		/* It will return string grade depending on score.
		 * example if it is 98 then it will return A+
		 * or if it is 59 then it will return F 
		 */
		String grade = "";
		if((98 <= score)&&(score<=100))
			grade = "A+";
		else if((92 <= score)&&(score<98))
			grade = "A";
		else if((90 <= score)&&(score<92))
			grade = "A-";
		else if((88 <= score)&&(score<90))
			grade = "B+";
		else if((82 <= score)&&(score<88))
			grade = "B";
		else if((80 <= score)&&(score<82))
			grade = "B-";
		else if((78 <= score)&&(score<80))
			grade = "C+";
		else if((72 <= score)&&(score<78))
			grade = "C";
		else if((70 <= score)&&(score<72))
			grade = "C-";
		else if((60 <= score)&&(score<70))
			grade = "D";
		else if((0 <= score)&&(score<60))
			grade = "F";
		else
			grade = "ERROR";
		return grade;
	}
	/* 
	 * Calculate the sum of all multiples of 5 and 6, up to 1000 inclusive.
	 * It must be calculated - just returning the single value will earn zero points!
	 * @param limit  the largest number to allow inclusion in the returned sum.
	 * @return sum of all nums up to limit that are divisible by 5 or 6.
	 */
	public static int sum56Multiples(int limit)
	{
		/* For loop runs until limit and if statement checks if (number or i) is divisible of 5 or 6
		 * and if it is then add that number.
		 * it will return final sum
		 */
		int sum = 0;
		for(int i = 0; i <= limit; i++)
		{
			if((i%5 == 0)||(i%6 == 0))
			{
				sum = sum+i;
			}
		}
		return sum;
	}
	/* 
	 * Calculates the sum of squares from given low and high values, inclusive.
	 * @param smallest int to include (squared) in sum
	 * @param largest int to include (squared) in sum
	 * @return the sum of squares of all #'s from smalles to largest.
	 */
	public static int sumSquares(int lowest, int highest)
	{
		/* for loop will have counter i as lowest and will run until highest 
		 * it will square and add each number between lowest and highest
		 * it will return final sum
		 */
		int sum = 0;
		for(int i = lowest; i <= highest; i++)
		{
			sum = sum +(i*i);
		}
		return sum;
	}
	/* Greatest Common Divisor.
	 * Consider Euclid's Algorithm, from here: http://en.wikipedia.org/wiki/Greatest_common_divisor
	 * You may solve it iteratively or recursively.
	 * @param    a   first number
	 * @param    b   other number
	 * @return       greatest integer that evenly divides both a and b.
	 */
	public static int gcd(int a, int b)
	{
		/* it will return a if b is 0 otherwise will keep calling recursively 
		 *with passing parameters b as a and remainder of (a%b) as b 
		 */
		if(b == 0)
			return a;
		return gcd(b, a%b);
	}
	/* 
	 * sumOdds. Adds up all odd numbers from the array and returns it.
	 * @param   xs array of integers where we seek odd numbers
	 * @return  sum of all odd integers in the array xs.
	 */
	public static int sumOdds(int[] xs)
	{
		/* for loop will run until array length and 
		 * if statement will check each element of array to confirm 
		 * if it is odd or not using modulo operator.
		 * if element(number in array) is odd then it will add 
		 * at the end it will return final sum
		 * */
		int sum = 0;
		for(int i = 0; i < xs.length; i++)
		{
			if(xs[i]%2 == 1 || xs[i]%2 == -1)
			{
				sum=sum+xs[i];
			}
		}
		return sum;
	}
	/* 
	 * Finds the two smallest numbers in the array, returns their sum.
	 * @param xs array of integers where we seek the lowest values.
	 * @return the sum of the two smallest values in the array.
	 */
	public static int sumTwoLowest(int[] xs)
	{
		/* initialized first element of array as smallest and second as second smallest
		 * then it will check for if array is null or not
		 * then it will check for if array has one element 
		 * then it will compare first and second element of array to find current smallest
		 * then for loop will run from 2(in real it will 3rd element in array) as we checked first 2 to array length  
		 * inside for loop if-else if check for smallest and second smallest
		 * at the end once it has both updated values, it will be added and assigned to integer variable sum and 
		 * that will be returned as sum of two smallest integers in array. 
		 */
		int smallest = xs[0];
		int scndsmallest = xs[1];
		int sum = 0;

		if(xs == null || xs.length == 0)
			return 0;
		if(xs.length == 1)
			return xs[0];

		if(xs[1] < xs[0])
		{
			smallest = xs[1];
			scndsmallest = xs[0];
		}

		for(int i = 2; i < xs.length; i++)
		{
			if(xs[i]<smallest)
			{
				scndsmallest = smallest;
				smallest = xs[i];
				//System.out.println("Smallest : "+smallest);
			}
			else if(xs[i] < scndsmallest)
			{
				scndsmallest = xs[i];
				//System.out.println("Second Smallest : "+scndsmallest);
			}
		}
		sum = smallest+scndsmallest;
		//Return sum
		return sum;
	}
}
