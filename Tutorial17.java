
public class Tutorial17 {
	public static void main(String[] args){
		//Here we create a new instance of the Frog class
		Frog frog1 = new Frog();
		
		frog1.setAge(12);
		frog1.setName("Simon");
		
		System.out.printf("Frog name: %s%nFrog age: %d%n",frog1.getName(), frog1.getAge());
	}
}

class Frog{
	/*
	 * "private" encapsulates these two variables within the Frog class meaning they cannot
	 * be accessed from any other class.
	 * This is where "getters" (getAge and getName) come in use as it allows other classes
	 * to indirectly assign values to the variables without accessing them directly.
	 * Furthermore, it means the user only has to know the names of the methods instead of knowing
	 * both the variables and the methods. For example, we set the name by using "frog1.setName("Simon");"
	 * instead of accessing the through the instance: "frog1.name = "Simon""
	 */
	
	
	private int age;
	private String name;
	
	/*
	 * "this" refers to the instance.
	 * This means that we could let "newAge" be called "age" instead, and the instance variable would
	 * still change to whatever has been passed through as "age" as we use the "this" keyword.
	 */
	public void setAge(int newAge){
		this.age = newAge;
	}
	
	/*
	 * Here we see "this" in action.
	 * We've declared a variable called "name", which is the same name as the instance variable "name",
	 * this is not a problem however as "name" is local to the method "setName" whereas "this.name" is
	 * accessing the instance variable "name".
	 * "this" ensures that the instance variable is being referred to.
	 * "this" refers to the particular object/that instance.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/*
	 * "this" does not need to be used here because there is no other "age" within this scope.
	 * The scope here is the "getAge" method and as you can see, there is no ambiguity as there is no
	 * other "age" variable in use.
	 */
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
}