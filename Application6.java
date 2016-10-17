
public class Application6 {
	public static void main(String[] args){
		
		/*
		 * Here is a basic example of how "if", "else if" and "else" statements
		 * can be implemented into an application. 
		 */
		
		int myInt = 0;
		
		while(true){
			System.out.printf("Iteration: %d%n", myInt);
			
			if(myInt<10){
				myInt++;
			}
			
			else if(myInt==10){
				System.out.println("The application will now close");
				break;
			}
			
			else{
				System.out.println("The starting value of \"myInt\" is incorrect, please change");
				break;
			}
		}
	}
}
