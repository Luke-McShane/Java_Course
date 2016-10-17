
public class Application10 {
	public static void main(String[] args){
		
		//myValue is a value that can hold up to 32bits of data.
		int myValue = 0;
		
		/*
		 * myValues is a reference.
		 * myValues points to "new int[3]". The new keyword indicates
		 * that memory must be allocated. The amount of memory that is
		 * to be allocated here is enough to hold 3 integers
		 */
		int[] myValues;
		myValues = new int[3];
		
		/*
		 * This shows how Java automatically assigns every value in an array
		 * to be 0 at initialisation.
		*/
		System.out.println(myValues[myValue]);
		System.out.println(myValues[1]);
		System.out.println(myValues[2]);
		
		myValues[0] = 12;
		myValues[1] = 47;
		myValues[2] = 85;
		
		/*
		 * Simple for loop that iterates through the array, printing out the value
		 * corresponding to the current iteration each pass.
		 */
		for(int i=0; i<myValues.length; i++){
			System.out.println(myValues[i]);
		}
		
		
		//It is also possible to define the contents of the array upon initialisation.
		int[] newValues = {1, 2, 3, 4, 5};
		
		for(int j=0; j<newValues.length; j++){
			System.out.println(newValues[j]);
		}
	}
}
