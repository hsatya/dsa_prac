import java.util.*;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][];
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // for (int ar : arr) {
        //     System.out.println(arr);
        // }
        // for (int i = 0; i < arr.length; ++i) {
        //     for (int j = 0; j < arr[i].length; ++j) {
        //         System.out.println(arr[i][j]);
        //     }
        // }

        // int[][] arr2d = {
        //     {1,2,3},
        //     {1,2,3,4},
        //     {1,2,3,4,5}
        // };
        // for (int i = 0; i < arr2d.length; ++i) {
        //     for (int j = 0; j < arr2d[i].length; ++j) {
        //         System.out.println(arr2d[i][j]);
        //     }
        // }

        // input of 2d array
        // int[][] arr2d = new int[3][2];
        int[][] arr2d = {
                { 1, 2, 3 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4, 5 }
        };
        // for (int i = 0; i < arr2d.length; ++i) {
        //     for (int j = 0; j < arr2d[i].length; ++j) {
        //         int x = sc.nextInt();
        //         arr2d[i][j] = x;
        //     }
        // }
        sc.close();

        // for (int i = 0; i < arr2d.length; ++i) {
        //     for (int j = 0; j < arr2d[i].length; ++j) {
        //         System.out.print(arr2d[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < arr2d.length; ++i) {
        //     System.out.println(Arrays.toString(arr2d[i]));
        // }
        for (int[] arr : arr2d) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        for (int[] arr : arr2d) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
