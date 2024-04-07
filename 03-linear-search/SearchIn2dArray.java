public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 21, 25, 27 },
                { 18, 24, 12, 3 },
                { 73, 100, 95, 97 },
                { 19, 2, 8 }
        };

        int target = 5;

        System.out.println(search(arr, target));
    }
    
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] == target)
                    return new int[] { i, j };
            }
        }

        return new int[] { -1 };
    }

    static boolean search2(int[][] arr, int target) {
        for (int[] ar : arr) {
            for (int element : ar) {
                if (element == target)
                    return true;
            }
        }

        return false;
    }
}
