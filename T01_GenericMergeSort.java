import java.util.Arrays;

/**
 * @author Yucheng Wang
 * @date 2023/10/21
 */
public class T01_GenericMergeSort {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 3, 6};
        mergeSort(intArray);
        System.out.println(Arrays.toString(intArray));
        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};
        mergeSort(strArray);
        System.out.println(Arrays.toString(strArray));

    }
    private static <E extends Comparable<E>> void merge(E[] result, E[] left, E[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        while (leftIndex < left.length) {
            result[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while (rightIndex < right.length) {
            result[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;
        }
    }
    public static <E extends Comparable<E>> void mergeSort(E[] list){
        if (list == null) {
            throw new RuntimeException("Input array cannot be null.");
        }
        if (list.length > 1) {
            int mid = list.length / 2;

            E[] leftHalf = Arrays.copyOfRange(list, 0, mid);
            E[] rightHalf = Arrays.copyOfRange(list, mid, list.length);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(list, leftHalf, rightHalf);
        }
    }
}
