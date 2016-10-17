
public class application20 {
	public static void main(String[] args){
		
		/*
		 * Strings are immutable meaning that once created, they cannot be changed.
		 * Here what we are doing is creating a new string every time we "add" to the
		 * original String.
		 * We effectively create a new reference each time we modify the String using +=.
		 * Each time we "add" to info using += we are effectively doing: info = info + "data"
		 * which means we are actually creating a new String().
		 * A new memory address reference is now assigned to the variable "info", and the old
		 * data is now left for garbage collection. This means that at compile-time, these
		 * addresses are cleaned as they are not used.
		 * The variable "info" points to "Hello". When we '+= " "', we are creating a new Object
		 * that "info" now refers to. Therefore info is no longer referencing the "Hello" object
		 * and this memory can be cleaned.
		 * 
		 * Using "+=" may not be incredibly less efficient because it will most likely be changed
		 * to StringBuilder() at compile-time by the compiler.
		 * The main thing to consider is that, especially if changing the value of a String() variable
		 * in a loop, using "+=" is extremely time-inefficient as you are creating a new String() object
		 * each time you add to the variable.
		 */
		String info = "My name is Kevin.";
		info += " ";
		info += "I am a teacher.";
		
		
		 //The StringBuilder class is used to create mutable strings. It is more space and time efficient than
		 //using "+=" as only one object is ever needed to be created.
		StringBuilder sb1 = new StringBuilder("My name is Pauline");
		sb1.append(" ");
		sb1.append("I am a laywer.");
		
		//Here is another way of modifying the variable.
		//This works because "append" is referencing the object, so adding another append will just  re-reference
		//the object.
		StringBuilder sb2 = new StringBuilder()
		.append("My name is George")
		.append(" ")
		.append("I am a bartender.");
		
		System.out.printf("%s%n%s%n%s%n", info, sb1.toString(), sb2.toString());
		
		
		//FORMATTING/////////////////////////////////////////////////////
		
		System.out.print("Tab:\tNewline:\n");
		System.out.println("A new line has been automatically added here.");
		
		//Formatting integers
		System.out.printf("Name: %s; age: %d; height: %f centimetres/n", "Roger", 4, 162.12);
		//The number after the "%" indicates the amount of padding for the field.
		for(int i=0; i<15; i++){
			System.out.printf("%2d TEXT\n", i);
		}
		for(int j=0; j<15; j++){
			System.out.printf("%-2d TEXT\n", j);
		}
		
		//Formatting floating point values
		//We can define both the padding (straight after the "%" sign) and the amount of decimal places (after padding)
		System.out.printf("Total value: %.2f\n", 2.3467);
		System.out.printf("Total calue: %-8.3f ben\n", 12.321);
	}
}
