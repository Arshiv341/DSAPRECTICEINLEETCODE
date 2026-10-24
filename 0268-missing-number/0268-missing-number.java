class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<=n;i++){
            set.add(i);
        }
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }
}