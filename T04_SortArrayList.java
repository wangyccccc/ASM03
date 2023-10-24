import java.util.ArrayList;

/**
 * @author Yucheng Wang
 * @date 2023/10/24
 */
public class T04_SortArrayList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        if (list.isEmpty()){
            return;
        }
        quickSort(list,0, list.size()-1);
    }
    private static <E extends Comparable<E>> void quickSort(ArrayList<E> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static <E extends Comparable<E>> int partition(ArrayList<E> list, int low, int high) {
        E pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private static <E extends Comparable<E>> void swap(ArrayList<E> list, int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(11);
        System.out.println("Original List: " + list);
        sort(list);
        System.out.println("Sorted List: " + list);
    }
}
