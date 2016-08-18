class Person {
	int age;
	String name;
	
	void speak(){
		System.out.println("My name is " + name);
	}
	
	int yearToRetrived(){
		int years = 65 - age;
		return years;
	}
	
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}

public class App {
	public static void main(String[] args) {

		Person person1 = new Person();
		person1.age = 30;
		person1.name = "Alex";
		
		//person1.speak();
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		
	}
}
