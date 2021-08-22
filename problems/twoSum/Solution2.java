package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用Hash 表
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // 使用target减数组中的数，判断结果是否包含在hash表中，且结果的索引和i不同
        // target 6 数组[3, 3]，则map为(3, 1)
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                result[0] = i;
                result[i] = map.get(diff);
            }
        }

        return result;
    }
}
