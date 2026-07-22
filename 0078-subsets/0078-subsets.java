class Solution {
    public static void PrintF(int idx, int[] arr, List<Integer> ar,List<List<Integer>> ans,int n){
        if(idx==n){
            ans.add(new ArrayList<>(ar));
            return;
        }
        //take
        ar.add(arr[idx]);
        PrintF(idx+1,arr,ar,ans,n);
        //back trak
        ar.remove(ar.size()-1);
        //not take
        PrintF(idx+1,arr,ar,ans,n);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>ar=new ArrayList<>();
        PrintF(0,nums,ar,ans,nums.length);
        return ans;
    }
}