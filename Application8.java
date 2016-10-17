import java.util.Scanner;

public class Application8 {
	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		
		/*
		 * Here we declare the "myInt" variable OUTSIDE ofthe "do" statement. 
		 * This is due to "scope". Scope determines the locality of variables. 
		 * For example, if the variable was defined within the "do" statement,
		 * then it would only be able to be accessed within that statement. However,
		 * we need to access it in the "while" statement underneath, it must
		 * therefore be definied within an appropriate scope. Because the "main"
		 * method contains both "do" and "while" statements, we can define "myInt"
		 * within it and it will be able to be accessed throughout this entire method.
		 */
		int myInt;
		
		/*
		 * "do" statements define a piece of code that will be run at least one time.
		 * The "while" statement underneath is checked AFTER the every single run through
		 * of the code included in the "do" statement.
		 * This means that any code that must be run at least once can be run.
		 */
		do{
			System.out.println("Enter an integer: ");
			
			while(!myScanner.hasNextInt()){
				System.out.println("Integers only please");
				myScanner.nextLine();
			}
			myInt = myScanner.nextInt();
			if(myInt!=5)
				System.out.println("Wrong answer!");
			myScanner.nextLine();
		}
		while(myInt!=5);
		
		System.out.println("Well done.");
		myScanner.close();
	}
}
