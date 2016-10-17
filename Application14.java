
public class Application14 {
	public static void main(String[] args){
		
		Person person1 = new Person();
		person1.name = "John";
		person1.age = 13;
		person1.speak();
		person1.myEmotion();
		
		Person person2 = new Person();
		person2.name = "Christine";
		person2.age = 29;
		person2.speak();
		person2.myEmotion();
	}
}

class Person{
	String name;
	int age;
	
	//As you can see you are able to use code inside methods just as you would the "main" method.
	void speak(){
		System.out.printf("My name is %s and I am %d years old.%n", name, age);
	}
	void myEmotion(){
		String[] emotions = {"happy", "sad", "pissed off", "knackered", "hungry"};
		System.out.printf("I am feeling really %s.%n", emotions[(int ) (Math.random()*4)]);
	}
	
}