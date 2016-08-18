 class Human {
	 String name;
	 int age;
	 
	 void speak(){
		 System.out.println("My name is " + name + " and I am a " + age + " years old.");
	 }
}


public class App {
	public static void main(String[] args) {
		Human person1 = new Human();
		person1.age = 10;
		person1.name = "Alex";
		person1.speak();
		
		Human person2 = new Human();
		person2.age = 20;
		person2.name = "Liuda";
		person2.speak();
		
	}
}

