
public class rectangle extends parentshape  {
	// rectangle class
	public rectangle(double aWidth, double aHeight) {
		super(aWidth, aHeight);
		
		
	}
	// same getArea as usual
	public double getArea() {
		
		area = w * h;
		
		return area;
	}
	// return sides to be compared in my compareTo method
	public int getSides() {
		sides = 4;
		return sides;
	}


}
