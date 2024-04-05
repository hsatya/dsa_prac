import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(52);
        list.add(60);
        list.add(37);
        list.add(30);
        list.add(40);

        // for (Integer l : list) {
        //     System.out.print(l + " ");
        // }

        System.out.println(list);
        list.set(0, 100);
        list.remove(4);
        // System.out.println(list.contains(37));
        System.out.println(list);

        // list.update
    }
}
