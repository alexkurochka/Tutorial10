class Robot {

	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int heigth) {
		System.out.println(heigth);
	}

	public void move(String direction, int meters) {
		System.out.println("Move on " + meters + " to direction " + direction);
	}
}

public class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("hi there");
		sam.jump(7);
		sam.move("west", 60);
		
		String newDirection = "east";
		int newMeters = 700;
		sam.move(newDirection, newMeters);

	}
}
