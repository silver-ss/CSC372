import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    public static void selectionSort(ArrayList<Student> array, Comparator<Student> comparator) {
        int n = array.size();
        int minIndex;
        Student temp;

        for (int i = 0; i < n; ++i) {
            minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (comparator.compare(array.get(j), array.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            temp = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
    }
}
