class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int k =0;
        int i=0;
        while(i<nums1.length){
            arr[k++]=nums1[i];
            i++;
        }
        int j=0;
        while(j<nums2.length){
            arr[k++]=nums2[j];
            j++;
        }
        Arrays.sort(arr);
        if(n%2!=0){
            return arr[n/2]+0.00;
        }
            return (arr[n/2 - 1]+arr[n/2])/2.00+0.00;
    }
}