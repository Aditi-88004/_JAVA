import java.util.*;
public class arrray_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = in.nextInt();
		int arr[] = new int[size];
        System.out.println("Enter array elements: ");		
        for(int i=0; i<size; i++) {
        	arr[i]=in.nextInt();
        }
        System.out.println("The new array:");
        for(int i=0; i<size; i++) {    //Adding 5 to each element
        	arr[i]+=5;
        	System.out.print(arr[i]+" ");
        }
        

	}

}
