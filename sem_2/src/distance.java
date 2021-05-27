
public class distance {
    int feet,inches;
    distance(int feet, int inches){
    	this.feet = feet;
    	this.inches = inches;
    }
    public static distance cal(distance d1, distance d2) {
    	distance d=new distance(0,0);
      	d.inches = d2.inches - d1.inches;
    	d.feet = d2.feet - d1.feet  + (d.inches/12);
    	d.inches = d.inches%12;
    	return d;
    }
    public String toString() {
    	return feet +" feet "+inches+" inches";
    }
	public static void main(String[] args) {
		distance d1 = new distance(20,10);
		distance d2 = new distance(60,30);
		distance d = cal(d1,d2);
		System.out.println("point 1: "+d1);
		System.out.println("point 2: "+d2);
		System.out.println("Distance: "+d);
		
		
	}

}
