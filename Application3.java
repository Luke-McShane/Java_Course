
public class Application3 {
	public static void main(String[] args){
		
		/*
		 * The "String" argument is actually a class that can hold mutable variables within
		 * it as long they are strings.
		 * The "[]" indicates that "String" is an array, therefore is immutable (the variables
		 * within are mutable).
		 * Arguments can be passed in by the user through the command line, these can then be
		 * accessed within the program given necessary code has been written to do so.
		 */
					
		String text = "Hello";
		
		String blank = " ";
		
		String name = "Luke";
		
		String basicSentence = text + blank + name;
				
		System.out.println(basicSentence);
		
		System.out.println(text + blank + name);
		
		System.out.println("Hello " + name);
	}
}
