import java.util.Comparator;

public class SortName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}