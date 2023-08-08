import java.util.ArrayList;
// tester
import java.util.Collections;

public class Tester {
public static void main(String[] args) {
ArrayList<parentshape> shapes = new ArrayList<parentshape>();
 
shapes.add(new rectangle(5.0, 10.0)); // area is 50.0
shapes.add(new rectangle(7.0, 5.0)); // area is 35.0
shapes.add(new square(3.0)); // area is 9.0
shapes.add(new square(9.0)); // area is 81.0
shapes.add(new triangle(10.0, 5.0)); // area is 25.0
shapes.add(new triangle(5.0, 15.0)); // area is 37.5
shapes.add(new Circle(5.0)); // area is about 78.54
shapes.add(new Circle(2.0)); // area is about 12.57
Collections.sort(shapes);
for (parentshape shape: shapes) {
    System.out.println(shape.getArea());
}


	}
}