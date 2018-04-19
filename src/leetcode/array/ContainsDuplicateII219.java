package array;

import java.util.HashMap;
import java.util.Map;

class Solution5 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 输入条件判断
        if (nums == null || nums.length < 2 || k < 1) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // 如果没有对应的key添加进去
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
            // 已经有对应的key-value对
            else {
                // 原来保存的值对应的下标，它一定小于现在的下标
                int value = map.get(nums[i]);
                if (i - value <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }
}



public class ContainsDuplicateII219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s = new Solution5();
		int[] num= {1,2,3,1};
		System.out.println(s.containsNearbyDuplicate(num, 4));
	}
}
