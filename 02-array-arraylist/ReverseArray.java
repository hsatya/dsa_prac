import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse2(int[] arr) {
        int l = arr.length;
        int[] revArr = new int[l];

        for (int i = l - 1; i >= 0; --i) {
            revArr[l - i - 1] = arr[i];
        }

        return revArr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int l = arr.length;

        for (int i = 0; i < l / 2; ++i) {
            swap(arr, i, l - i - 1);
        }
    }
}
