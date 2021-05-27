
public class Varargs {
	
	public static void Varargs(String...strings) {
		System.out.println("\nNumber of arguments are: "+strings.length);
		System.out.println("The arguments are: ");
		for(String s:strings) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Varargs();
		Varargs("Apple","Mango","Pineapple","Pear");
		Varargs("Car","Bike");

	}

}
