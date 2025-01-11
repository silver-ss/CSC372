public class ShapeArray {
    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(4,2);
        Cone cone = new Cone(6,3);
        Shape[] shapeArray = {sphere, cylinder, cone};

        for (Shape shape : shapeArray) {
            // implicitly calls the overwritten toString() method
            System.out.println(shape);
        }
    }
}