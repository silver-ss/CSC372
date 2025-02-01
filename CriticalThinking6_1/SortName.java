import java.util.Comparator;

public class SortName implements Comparator<Student>{
    /*
    * Compares two students by name.
    * @param s1 the first student
    * @param s2 the second student
    * @return a negative integer, zero, or a positive integer as the first student is less than, equal to, or greater than the second student
    */
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}