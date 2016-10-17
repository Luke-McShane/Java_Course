import java.util.Scanner;

public class Application11 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String[] words = new String[3];
		
		//Here we get the user to assign a string to each element in the array.
		for(int i=0; i<words.length; i++){
			words[i] = input.nextLine();
		}
		
		/*
		 * A way to print each element in an array. "word" is the iterator and
		 * whatever comes after ":" is the array that will be accessed and iterated
		 * through.
		 */
		for(String word: words){
			System.out.println(word);
		}
		input.close();
		
		//A word on values and references.
		
		
		// "int" is a primitive data type, meaning that they are the most basic data types in java.
		// An int is assigned enough memory to store 32-bits worth of data.
		int myInteger = 0;
		
		// "String" is a class meaning that it does not assign a set amount of memory. A string could
		// be unlimited characters long.
		// Instead we use a reference, in this case the reference is "text".
		// "text" refers to an address in memory that stores that actual data.
		// The initial memory address will be null if there is no string data. This effectively means
		// that the reference is pointing to nothing.
		String text = null;
		
		//Here is an example.
		//This shows that "texts" will refer to an array of strings. Effectively "texts" will refer to
		// an array of references.
		String[] texts = new String[2];
		texts[0] = "Dog";
		System.out.printf("Element 1: %s%nElement 2: %s", texts[0], texts[1]);
		
		
	}
}
