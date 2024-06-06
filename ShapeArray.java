public class ShapeArray {
    public static void main(String[] args) {
        
        // Creating instances of shape classes
        Sphere s = new Sphere(1.0);
        Cylinder c = new Cylinder(1, 3);
        Cone cn = new Cone(1, 3);

        // Creating shape array
        Shape[] shapeArray = {s, c, cn};
        // Calling toString method for each shape
        for (int n = 0; n < shapeArray.length; n++) {
            System.out.println(shapeArray[n].toString() + "\n");
        }
    }
}
