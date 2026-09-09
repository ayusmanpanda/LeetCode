class Solution {
    public long countCommas(long n) {
        if (n < 1000) return 0;
        long ans=0;
        long thresold=1000;
        while(thresold<=n){
            ans += n-thresold+1;
            thresold *= 1000;
        }
        return ans;
    }
}