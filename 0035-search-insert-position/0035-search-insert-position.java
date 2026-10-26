class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0]>=target) return 0;
        int idx=1;
        int prev=0;
        while(idx<nums.length){
            if(target>nums[prev] && target<=nums[idx]){
                return idx;
            }
            prev++;
            idx++;
        }
        return nums.length;
    }
}