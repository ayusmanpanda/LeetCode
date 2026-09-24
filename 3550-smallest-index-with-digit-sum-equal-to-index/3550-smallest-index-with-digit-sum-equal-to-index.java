class Solution {
    public int sumDig(int n){
        int val=0;
        while(n>0){
            val += n%10;
            n= n/10;
        }
        return val;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==sumDig(nums[i])) return i;
        }
        return -1;
    }
}