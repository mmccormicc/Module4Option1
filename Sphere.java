
public class Sphere extends Shape {
    
    double r;

    // Constructor
    public Sphere(double radius) {
        r = radius;
    }

    // Methods
    public double surface_area() {
        return (4.0 * Math.PI * Math.pow(r, 2.0));
    }

    public double volume() {
        return ((4.0/3.0) * Math.PI * Math.pow(r, 3.0));
    }

    public String toString() {
        return ("Surface Area: " + surface_area() + "\nVolume: " + volume());
    }
}
