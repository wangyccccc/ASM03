import java.util.Arrays;

/**
 * @author Yucheng Wang
 * @date 2023/10/21
 */
public class T02_QuickSort {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 3, 6};
        quickSort(intArray);
        System.out.println(Arrays.toString(intArray));
        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};
        quickSort(strArray);
        System.out.println(Arrays.toString(strArray));
    }
    public static <E extends Comparable<E>> void quickSort(E[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static <E extends Comparable<E>> void quickSort(E[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    private static <E extends Comparable<E>> int partition(E[] arr, int low, int high) {
        E pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }
    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
