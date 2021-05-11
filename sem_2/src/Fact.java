import java.util.*;
public class Fact {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		for(int i=1; i<=num; i++) {
			fact*=i;
		}
		System.out.print("Factorial of "+num+" is: "+fact);

	}

}
