import java.util.*;
public class Shuffle {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(shuffle(nums, 3)));

    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i=0; i<(2*n)-2; i=i+2) {
            ans[i] = nums[i];
            ans[i+1] = nums[i+n];
        }
        return ans;
    }
}