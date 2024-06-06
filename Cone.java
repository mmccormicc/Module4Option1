public class Cone extends Shape {

    double r;
    double h;

    // Constructor
    public Cone(double radius, double height) {
        r = radius;
        h = height;
    }

    // Methods

    public double surface_area() {
        return Math.PI * r * (r + Math.sqrt(Math.pow(h, 2.0) + Math.pow(r, 2.0)));
    }

    public double volume() {
        return (Math.PI * Math.pow(r, 2.0) * h/3.0);
    }

    public String toString() {
        return ("Surface Area: " + surface_area() + "\nVolume: " + volume());
    }
}
