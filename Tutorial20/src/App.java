
public class App {
	public static void main(String[] args) {

		String list = "";
		list += "My name is";
		list += " ";
		list += "Alex";
		
		System.out.println(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Her name is");
		sb.append(" ");
		sb.append("Rita!");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("This is a")
		 .append(" ")
		 .append("car!");
		
		System.out.println(s.toString());
		
		/// Formating
		
		System.out.printf("This is a %d$\n", 6);
		
		System.out.printf("I have some %.2f", 5.769);
	}
}
