import java.util.Scanner;

public class Application7 {
	public static void main(String[] args){
		
		/*
		 * Creates a scanner object.
		 * This object my be assigned a user's input.
		 * "Scanner" is the object name whereas the "new"
		 * part indicates a new instance of that object
		 * has been created.
		 */
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		
		/*
		 * Here the program will assign the next line of
		 * text the user inputs to the newly created "myLine"
		 * string.
		 */
		String myLine = userInput.nextLine();
		System.out.println("Your string: " + myLine + "\n");
		
		/*
		 * It is also possible to define a specific input from the
		 * user.
		 */
		
		System.out.println("Enter an integer: ");
		
		/*
		 * Here we are checking that the user is inputting data as the
		 * correct data type.
		 * Before assigning the input to the variable, the program checks
		 * that it is in the correct format. If not, the user is informed
		 * then asked to enter their input again.
		 * "nextLine" is used to avoid any exceptions being thrown as the
		 * user is able to enter anything, and "nextLine" will accept any
		 * data type.
		 */
		while(!userInput.hasNextInt()){
			System.out.println("Integer only please!");
			userInput.nextLine();
		}
		int myInt = userInput.nextInt();
		System.out.println("Your integer: " + myInt + "\n");
		
		
		
		System.out.println("Enter a floating point value: ");
		while(!userInput.hasNextDouble()){
			System.out.println("Floating point only please!");
			userInput.nextLine();
		}
		double myDouble = userInput.nextDouble();
		System.out.println("Your floating point value: " + myDouble);
		
		/*
		 * Note that only one instance of "userInput" is created and is
		 * only ever referred to, never re-initialized.
		 */
		
		//Closes the scanner object.
		userInput.close();
	}
}
