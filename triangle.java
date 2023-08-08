
public class triangle extends parentshape {
	// triangle class, changing aWidth to base for clarity
	public double base;
	
	public triangle(double aWidth, double aHeight) {
		super(aWidth, aHeight);
		base = aWidth;
		h = aHeight;
		
		
	}
	
	public double getArea() {
		
		area = (base * h) / 2;
		
		return area;
		
	}



	@Override
	public int getSides() {
		sides = 3;
		return sides;
	}
	
	

}
