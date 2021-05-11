import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int num,sum=0,c;
	      Scanner scan =new Scanner(System.in);
	      do{
	         System.out.println("Enter the number: ");
	         num=scan.nextInt();
	         sum+=num;
	         System.out.println("The sum of numbers is: "+sum);
	         System.out.println("do you want to continue this program type 1");  
	         c=scan.nextInt();
	      }while(c==1);

	}

}
