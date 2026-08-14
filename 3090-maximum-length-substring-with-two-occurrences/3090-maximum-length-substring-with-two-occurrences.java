class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int j=0;
        int[] arr= new int[26];
        int ans = 0;
        while(j<s.length()){
            arr[s.charAt(j)-'a']++;
            while(i<s.length() && arr[s.charAt(j)-'a']>2){
                arr[s.charAt(i)-'a']--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}