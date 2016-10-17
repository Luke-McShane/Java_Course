
public class Application5 {
	public static void main(String[] args){
		
		/*
		 * The first section is code that will be executed
		 * prior to the first iteration of the loop.
		 * 
		 * The section in the middle is the condition that
		 * is checked before every iteration of the loop.
		 * 
		 * The section at the end is code that will be executed
		 * after every iteration of the loop.
		 * 
		 * "format" or "printf" is a way of printing a statement
		 * where the format of each output can be specified.
		 * For example, here %d is used as the printed variable
		 * (i) is in decimal format.
		 */
		
		for(int i=0; i<5; i+=1){
			System.out.printf("Value: %d\n", i );
		}
		
		String myString = "Hello World";
		float myFloat = 1232;
		int myInt = 112;
		
		System.out.printf("String: %s%nFloat: %f%nInteger: %d", myString, myFloat, myInt);
	}
}
