class Solution {
    public int digitMul(int val){
        int ans=1;
        while(val>0){
            ans *= val%10;
            val = val/10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<Integer.MAX_VALUE;i++){
            int mul = digitMul(i);
            if(mul%t==0){
                return i;
            }
        }
        return -1;
    }
}