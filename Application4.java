
public class Application4 {
	public static void main(String[] args)
	{
		/*
		 * Here we can see that a statement has been made instead of assigning
		 * an actual value - either true or false - to the variable. The output
		 * of this variable will depended on the statement made.
		 */
		boolean trueStatement = 4 < 5;
		boolean falseStaetment = 4 > 9;
		
		System.out.println(trueStatement);
		System.out.println(falseStaetment);
		
		
		/*
		 * Here we compare a variable (of type integer) to an integer.
		 * The loop continues until the condition is no longer met.
		 */
		int myVal = 0;
		while(myVal < 10)
		{
			myVal = myVal + 1;
			System.out.println(myVal);
			System.out.println("");
		}
		
		
		
		System.out.println("IF STATEMENT");
		/*
		 * Here a boolean expression is incorporated into a while loop.
		 * Initially myBool is true, however, each iteration of the loop
		 * sees myVal2 increase by 1. The "if" statement checks the value
		 * of myVal2 each iteration and, if greater than 10, myBool is set
		 * to false and therefore the condition is no longer met so the
		 * loop breaks.
		 */
		
		int myVal2 = 1;
		boolean myBool = myVal2 < 10;
		while(myBool == true)
		{
			
			System.out.println(myVal2);
			System.out.println("");
			myVal2 += 1;
			if(myVal2 > 10)
			{
				myBool = false;
			}
		}
	}
}
