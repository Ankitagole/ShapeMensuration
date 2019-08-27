package Client;

import All2DShapes.*;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Shapes2D> rectangles = Arrays.asList(new Square(3),new Rectangle(3,4),new Circle(3),new Triangle(4,3));
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println("2D shapes Area = " + rectangles.get(i).getArea());
        }
    }
}
