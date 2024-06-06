public class Cylinder extends Shape{
    
    double r;
    double h;

    // Constructor
    public Cylinder(double radius, double height) {
        r = radius;
        h = height;
    }

    // Methods
    public double surface_area() {
        return (2.0 * Math.PI * r * h) + (2.0 * Math.PI * Math.pow(r, 2.0));
    }

    public double volume() {
        return (Math.PI * Math.pow(r, 2.0) * h);
    }

    public String toString() {
        return ("Surface Area: " + surface_area() + "\nVolume: " + volume());
    }
}
