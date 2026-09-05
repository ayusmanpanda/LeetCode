class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;
        int[] minArr= new int[n];
        minArr[n-1]= nums[n-1];
        for(int j=n-2;j>=0;j--){
            minArr[j] = Math.min(nums[j],minArr[j+1]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max= Math.max(nums[i],max);
            if(max-minArr[i]<=k) return i;
        }
        return -1;
    }
}