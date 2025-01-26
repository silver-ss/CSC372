import java.util.Comparator;

public class SortRollno implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollno().compareTo(s2.getRollno());
    }
}