
public class square extends rectangle {
	
	// method specific to our square shape
	public double measure;
	
	public square(double measure) {
		super(measure, measure);
		
	}
	public int getSides() {
		sides = 4;
		return sides;
		
	}



}
