package all3DShapes;

public class Cube implements Shapes3D{
    double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double getVolume() {
        return 6 * length * length;
    }

    @Override
    public double getSurfaceArea() {
        return length * length * length;
    }
}
