import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int num,c=0;
	     Scanner scan =new Scanner(System.in);
	     System.out.println("Enter the number that you want to check is prime or not: ");
	     num = scan.nextInt();
	     for(int i=2;i<=num-1;i++){
	       if(num%i==0){ 
	         c++;
	       }
	     }
	    if(c==0)
	      System.out.println(num +" is prime");
	    else
	      System.out.println(num +" is not prime");

	}

}
