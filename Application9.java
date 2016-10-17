import java.util.Scanner;
public class Application9 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String myText = input.nextLine();
		
		/*
		 * The switch statement is almost identical to the if
		 * statement, however we can only check whether the variable
		 * is equivalent to something, whereas in if statements you
		 * are able to check if an integer is less than or greater
		 * than etc..
		 * It is generally considered better practise to use switch
		 * statements and it is also more efficient, especially when
		 * there are many statements.
		 * Switch works with byte, short, char and int data types, and
		 * also the String class.
		 * A break statement is needed to terminate the enclosing switch
		 * statement.
		 */
		
		switch(myText){
		case "start":
			System.out.println("Machine has started");
			break;
			
		case "stop":
			System.out.println("Machine has stopped");
			break;
			
		default:
			System.out.println("Command not recognized");	
		}
		input.close();
	}
}
