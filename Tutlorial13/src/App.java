


public class App {
	public static void main(String[] args) {
		Human person1 = new Human();
		person1.age = 10;
		person1.name = "Alex";
		
		Human person2 = new Human();
		person2.age = 20;
		person2.name = "Liuda";
		
		System.out.println(person2.name);
	}
}

 class Human {
	 String name;
	 int age;
}