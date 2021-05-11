import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		int binary[]=new int [20];
		int num, i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number that you want to convert decimal into binary: ");
		num=scan.nextInt(); 
		while(num!=0)
		{
		binary[i]=num%2; 
		num/=2; 
		i++; 
		}
		System.out.println("binary number is: ");
		for(int j=i-1;j>=0;j--)
		System.out.print(binary[j]+" ");
	}

}