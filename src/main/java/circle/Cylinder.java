package circle;

public class Cylinder extends Circle {
    private double height;
    final double PI = 3.14;

    //constructors
    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String colour) {
        super(radius, colour);
        this.height = height;
    }

    //getter
    double getHeight() {
        return height;
    }
    //setter

    public void setHeight(double height) {
        this.height = height;
    }

    // should return the surface area
    @Override
    public double getArea() {
        return 2 * PI * super.getRadius() * (super.getRadius() + this.height);
    }

    // should return the cylinder volume
    double getVolume() {
        return PI * getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder parameters: \n\tradius: " + super.getRadius() + "\n\tcolour: " + super.getColour() + "\n\theight: " + getHeight() + "\n\tarea: " + getArea() + "\n\tvolume: " + getVolume();
    }
}
