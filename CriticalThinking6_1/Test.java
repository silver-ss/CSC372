import java.util.ArrayList;

public class Test {
    ArrayList<Student> students;

    private static void printStudents(ArrayList<Student> array) {
        for (Student s : array) {
            System.out.printf("%d | %-6s | %s\n", s.getRollno(), s.getName(), s.getAddress());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        // add 10 students to the array
        students.add(new Student(1007, "Bob","100 Main St"));
        students.add(new Student(1002, "Jane","999 Speer blvd"));
        students.add(new Student(1003, "Suzy","725 Left St"));
        students.add(new Student(1008, "Billy","600 Orchard St"));
        students.add(new Student(1005, "Omar","545 Pine Ct"));
        students.add(new Student(1006, "Phil","2222 Purple St"));
        students.add(new Student(1009, "Sarah","878 MLK Blvd"));
        students.add(new Student(1000, "Minky","242 Broadway St"));
        students.add(new Student(1001, "Turt","818 Lucky St"));
        students.add(new Student(1004, "Rain","944 Grant St"));

        // before sorting
        System.out.println("Before Sorting:");
        printStudents(students);

        // sort by name
        SelectionSort.selectionSort(students, new SortName());
        System.out.println("Sorted by name:");
        printStudents(students);

        // sort by rollno
        SelectionSort.selectionSort(students, new SortRollno());
        System.out.println("Sorted by rollno:");
        printStudents(students);
    }
}