import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    } // return negative value if s1.getName() comes before s2.getName()
    // returns 0 if both names are equal
    // returns a positive value if s1.getName() comes after s2.getName()
}