
// general introduction
// this assignment is supposed to provide a general example of inheritance 
// because all shapes, while having different number of sides and different side lengths
// share individual areas depending on what kind of shape it is
// our parent class sets up a skeleton of any shape that could be imagined and so each child,
// while unique, shares the basic values which its parent provides

public abstract class parentshape implements Comparable<parentshape> {
	
	// initialize my instance variables that will allow us to get double values for the area,
	// width, and height
	public double w;
	public double h;
	public double area;
	public int sides;
	
	// our constructor which provides a structure for our instance variable and also a way
	// to extend to other child classes
	public parentshape(double aWidth, double aHeight) {
		w = aWidth;
		h = aHeight;
		
		
	}
	// set of conditionals that first compares by the number of sides for natural ordering
	// if they have equal amount of sides, then we need to compare by the size of the area
	public int compareTo(parentshape anotherShape) {
		
		if (this.getSides() < anotherShape.getSides()) {
			return -1;
		}
		if (this.getSides() > anotherShape.getSides()) {
			return 1;
		}
		// alright, if the first two if statements arent viable, the shapes must have an equal number of sides
		if (this.getSides() == anotherShape.getSides()) {
			if (this.getArea() < anotherShape.getArea()) {
				return -1;
			}
			if (this.getArea() > anotherShape.getArea()) {
				return 1;
			}
			if (this.getArea() == anotherShape.getArea()) {
				return 0;
			}
		}
		
		return 0;
		
	}
	
	// abstract parentshape class so that getArea can be called in the children classes but 
	// does not need to be called in the general parent class
	public abstract double getArea();
	public abstract int getSides();
}
