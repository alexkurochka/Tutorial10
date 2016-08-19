class Frog {

	private String name;
	private int id;
	
	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" ").append(id);
		return sb.toString();
	}
	
	
}

public class App {
	public static void main(String[] args) {

		Frog frog1 = new Frog(2,"Leo");
		System.out.println(frog1);
	}
}
