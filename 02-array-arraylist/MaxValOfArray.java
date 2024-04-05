import java.util.*;
public class MaxValOfArray {
    public static void main(String[] args) {
        int[] arr = { 2, 23, 21, 8, 7, 3 };
        int maxI = maxVal(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max Value is: " + arr[maxI]);
    }

    static int maxVal(int[] arr) {
        int maxV = arr[0];
        int maxI = 0;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > maxV) {
                maxV = arr[i];
                maxI = i;
            }
        }

        return maxI;
    }

    static int maxRange(int[] arr, int start, int end) {

        // handle edge cases
        if (end > start)
            return -1;
        if (end == start)
            return start;
        
        int maxV = arr[start];
        int maxI = start;
        for (int i = start + 1; i <= end; ++i) {
            if (arr[i] > maxV) {
                maxV = arr[i];
                maxI = i;
            }
        }

        return maxI;
    }
}
