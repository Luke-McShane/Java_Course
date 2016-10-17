/* 
 * Here we look at "getter" methods. These retrieve data from classes that
 * would otherwise be un-retrievable.
 * In this example "name" and "age" are not encapsulated and can clearly be
 * accessed by class Application15 since person1.name is accessing the name
 * data and person1.age is accessing the age data.
 * If this data was encapsulated (local to that class), then we may use a getter
 * method to allow the data to be accessed by other classes.
 */

public class Application15 {
	public static void main(String[] args){
		Person person1 = new Person();
		person1.name = "Robert";
		person1.age = 26;
		
		String person1Name = person1.getName();
		int person1Age = person1.getAge();
		int person1yearsLeft = person1.yearsLeftToRetirement();
		
		System.out.printf("My name is: %s.%nI am %d years old.%nYears until retirement: %d.", person1Name, person1Age, person1yearsLeft);
	}
}


class Person{
	String name;
	int age;
	
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
	
	int yearsLeftToRetirement(){
		int yearsLeft = 65 - age;
		return yearsLeft;
}
	
}
