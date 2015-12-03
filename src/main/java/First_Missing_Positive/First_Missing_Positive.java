package leetcode;

/**
 * Created by jiangzhiheng on 2015/12/3.
 */

/**
 * Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.
 */
public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int len = nums.length;
        while(i < len){
            if(nums[i] != i + 1 && nums[i] >= 1 && nums[i] <= len && nums[nums[i] - 1] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
            else
                i++;
        }
        for(int j = 0;j < len;j++){
            if(nums[j] != j + 1)
                return j + 1;
        }
        return len + 1;
    }
}
