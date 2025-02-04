import java.util.Comparator;
import java.util.LinkedList;

public class SelectionSort {
    public static String SortStudents(LinkedList<Student> list, Comparator<Student> comparator) {
        int n = list.size();
        for (int i = 0; i < (n -1); ++i) {
            int minIndex = i;
            // find minimum index of comparison by name in unsorted portion
            for (int j = (i + 1); j < n; ++j) {
                //compare students at index j by name with the current minIndex
                //If the student has a name coming before the name at minIndex
                //then set the min index value to j
                if (list.get(j).getName().compareToIgnoreCase(list.get(minIndex).getName()) < 0 ) {
                    minIndex = j;
                }
            }
            // swap the elements if a smaller element was found
            if (minIndex != i) {
                Student temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        return "Sucessfully sorted the list by name!";
    }
}