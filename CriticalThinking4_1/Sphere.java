public class Sphere extends Shape{
    private double radius;
    //constructor
    public Sphere(double radius) {
        this.radius = radius;
    }
    //getter
    public double getRadius() {return radius;}
    //return the surface area of a sphere
    @Override
    public double surface_area() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }
    //return the volume of a sphere
    @Override
    public double volume() {
        return ((4.0/3) * Math.PI * Math.pow(radius,3));
    }
    //return a formatted string for main to print
    @Override
    public String toString() {
        return String.format("For the Sphere with a radius of %.2f:\n" +
                "    The surface area is %.2f.\n" +
                "    The volume is %.2f.\n", this.radius, surface_area(), volume());
    }
}
