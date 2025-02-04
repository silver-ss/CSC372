public class Student {
    private String name;
    private String address;
    private double GPA;

    //full constructor
    public Student(String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }
    //getters
    public String getName() {return name;}
    public String getAddress() {return address;}
    public double getGPA() {return GPA;}
    //setters
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setGPA(double GPA) {this.GPA = GPA;}
}