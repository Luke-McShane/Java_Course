
public class Application21 {
	public static void main(String[] args){
		Frog frog1 = new Frog(4, "Steve");
		Frog frog2 = new Frog(12, "Rob");
		System.out.println(frog1.toString());
		System.out.println(frog2);
	}
}

class Frog{
	
	private int id;
	private String name;
	
	//Here we create a constructor
	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	/* "toString()" is a method that returns a string representation of the object.
	* Without manually adding toString(), the object is given an automatic identity,
	* which is the name of the string, a "@" and some hashcode.
	* If you print an object, it will print the object identity, which is the return
	* value of toString().
	* It is good practise create a toString() method so you can identify each class easier.
	*/
	public String toString(){
		//Here we format a single string
		return String.format("%-2d: %s", id, name);
	}
}