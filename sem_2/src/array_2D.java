
public class array_2D {

	public static void main(String[] args)
			throws java.io.IOException 
	{
		int a[][] = new int [5][];
		a[0] = new int[1];
		a[1] = new int[2];
		a[2] = new int[3];
		a[3] = new int[4];
		a[4] = new int[5];
        int k=0;
        int i=0;
        for( i=0; i<5; i++) {
        	for(int j=0; j<i+1; j++) {
        		a[i][j] = k;
        		k++;
        	}
        }
        for( i=0; i<5; i++) {
        	for(int j=0; j<i+1;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
