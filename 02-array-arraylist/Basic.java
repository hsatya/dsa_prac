// package 02-array-arraylist;
import java.util.*;


public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] marks;
        // marks = new int[5];
        // for (int i = 0; i < marks.length; ++i) {
        //     marks[i] = sc.nextInt();
        // }
        // for (int i = 0; i < marks.length; ++i) {
        //     System.out.println(marks[i]);
        // }
        // sc.close();
        // int[] marks = {99,98,97,100,100};
        // for(int mark: marks) {
        //     System.out.println(mark);
        // }
        // System.out.println(Arrays.toString(marks));
        String[] str = new String[4];
        for (int i = 0; i < str.length; ++i) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
