import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter the command: ");
		
		String text = scanner.nextLine();
		
		
		switch(text) {
		case "start":
			System.out.println("The machine was started!");
			break;
		case "stop":
			System.out.println("The machine was stopped.");
			break;
			
			default: System.out.println("There is no command recognized!");
		}
	}
}
