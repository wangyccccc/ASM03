import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Yucheng Wang
 * @date 2023/10/24
 */
public class T03_ShuffleArrayList {
    public static <E> void shuffle(ArrayList<E> list){

        Collections.shuffle(list);

        Random rand = new Random();

//        for (int i = list.size() - 1; i > 0; i--) {
//            int j = rand.nextInt(i + 1);
//
//            // Swap elements at positions i and j
//            E temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, temp);
//        }
       }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Original ArrayList: " + list);
        shuffle(list);
        System.out.println("Shuffled ArrayList: " +list);

    }
}
