import java.util.*;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length, i=0;
        Map<Integer, Integer> ans = new HashMap<>();
        for(i=0; i<n; ++i) {
            Integer index = ans.get(nums[i]);
            if(index != null) {
                return new int[]{index, i};
            } else {
                ans.put(target-nums[i], i);
            }
        }
        return new int[0];
    }
    
}
