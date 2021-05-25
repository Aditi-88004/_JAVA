
public class type_conversion {
    public static void t1(int a) {
    	System.out.println(a+" is integer");
    }
    public static void t1(double a) {
    	System.out.println(a+" is double");
    }
    public static void t1(long a) {
    	System.out.println(a+" is long");
    }
    public static void main(String args[]) {
    	t1(3);
    	t1(23.0f);
    	t1('s');
    }
}