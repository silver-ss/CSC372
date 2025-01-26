public class Student {
    private Integer rollno;
    private String name;
    private String address;

    // constructor
    public Student(Integer rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    // getters
    public Integer getRollno() {return rollno;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    // setters
    public void setRollno(int num) {rollno = num;}
    public void setName(String name) {this.name = name;}
    public void setAddress(String add) {address = add;}
}