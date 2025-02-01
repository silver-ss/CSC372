import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    /*
     * Sorts the array using selection sort algorithm.
     * Order is determined by the comparator.
     * @param array the array to be sorted
     * @param comparator the comparator to compare elements
     */
    public static void selectionSort(ArrayList<Student> array, Comparator<Student> comparator) {
        int n = array.size();
        int minIndex; // index of the minimum element
        Student temp; // temporary variable for swapping

        // iterate through the array
        for (int i = 0; i < n; ++i) {
            // find the minimum element in the unsorted part of the array
            minIndex = i;
            // iterate through the unsorted part of the array
            for (int j = i + 1; j < n; ++j) {
                // compare the current element with the minimum element using the comparator
                if (comparator.compare(array.get(j), array.get(minIndex)) < 0) {
                // if the current element is smaller, update the minimum index
                    minIndex = j;
                }
            }
            // store the minimum element temporarily 
            temp = array.get(minIndex);
            // swap the minimum element with the first element in the unsorted part
            array.set(minIndex, array.get(i));
            // place the first element in the unsorted part in the correct position
            array.set(i, temp);
        }
    }
}
