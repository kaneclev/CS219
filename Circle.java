import java.util.*;


public class Circle extends parentshape {
	
	private double radius;
	
	public Circle(double radius) {
		super(radius, radius);
	
		this.radius = radius;
	}


	@Override
	public double getArea() {
		
		area = (radius * radius) * Math.PI;
		
		return area;
	}

	@Override
	public int getSides() {
		sides = Integer.MAX_VALUE;
		return sides;
	}
	

}
