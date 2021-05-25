
public class Complex {
	double real ,imaginary;
	Complex(double real, double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public static Complex addComp(Complex c1, Complex c2) {
		Complex c3=new Complex(0,0);
		c3.real = c1.real+c2.real;
		c3.imaginary = c3.imaginary+c3.imaginary;
		return c3;
	}
	public static Complex mulComp(Complex c1, Complex c2) {
		Complex c4=new Complex(0,0);
		c4.real = c1.real*c2.real;
		c4.imaginary = c4.imaginary*c4.imaginary;
		return c4;
	}
	public String toString() {
		
		return real+" + i"+imaginary;
	}
	public static void main(String[] args) {
		Complex c1 = new Complex(3.8,7.0);
		Complex c2 = new Complex(4.5,8.4);
		Complex c3 = addComp(c1,c2);
		Complex c4 = mulComp(c1,c2);
		System.out.println("Complex 1: "+c1);
		System.out.println("Complex 2: "+c2);
		System.out.println("Sum: "+c3);
		System.out.println("Multiplication: "+c4);
		
	}

}
