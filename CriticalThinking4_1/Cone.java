public class Cone extends Shape {
    private double radius;
    private double height;
    //constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    //getters
    public double getRadius() {return radius;}
    public double getHeight() {return height;}
    //return the surface area of a cone
    @Override
    public double surface_area() {
        double baseArea = (Math.PI * Math.pow(radius, 2));
        double slantHeight = (Math.sqrt(Math.pow(radius,2) + Math.pow(height,2)));
        double lateralArea = (Math.PI * radius * slantHeight);

        return (baseArea + lateralArea);

    }
    //return the volume of a cone
    @Override
    public double volume() {
        return ((1.0 /3.0) * Math.PI * Math.pow(radius,2) * height);
    }
    //return a formatted string for main to print
    @Override
    public String toString() {
        return String.format("For the Cone with a radius of %.2f & height of %.2f:\n" +
                "    The surface area is %.2f.\n" +
                "    The volume is %.2f.\n", this.radius, this.height, surface_area(), volume());
    }
}