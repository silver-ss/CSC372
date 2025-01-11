public class Cylinder extends Shape{
    private double radius;
    private double height;
    //constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    //getters
    public double getRadius() {return radius;}
    public double getHeight() {return height;}
    //return the surface area of a cylinder
    @Override
    public double surface_area() {
        return ((2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2)));
    }
    //return the volume of a cylinder
    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius,2) * height);
    }
    //return a formatted string for main to print
    @Override
    public String toString() {
        return String.format("For the Cylinder with a radius of %.2f & height of %.2f:\n" +
                "    The surface area is %.2f.\n" +
                "    The volume is %.2f.\n", this.radius, this.height, surface_area(), volume());
    }
}
