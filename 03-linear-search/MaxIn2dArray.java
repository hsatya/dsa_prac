// import java.util.*;
public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 21, 25, 27 },
                { 18, 24, 12, 3 },
                { 73, 100, 95, 97 },
                { 19, 2, 8 }
        };

        System.out.println(max2d(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    static int max2d(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ar : arr) {
            for (int el : ar) {
                if (el > max)
                    max = el;
            }
        }
        return max;
    }
    
}
