import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int[] arr = { 2, 23, 21, 8, 7, 3 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
