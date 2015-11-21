public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 0)
            return -1;
        return findDuplicate(1,nums.length - 1,nums);
    }
    private int findDuplicate(int start,int end,int[] nums){
        if(start == end)
            return start;
        int mid = (start + end)/2;
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] <= mid)
                count ++;
        }
        if(count > mid)
            return findDuplicate(start,mid,nums);
        else
            return findDuplicate(mid + 1,end,nums);
    }
}
