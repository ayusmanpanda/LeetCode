class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            if(i%k==0) mp.put(i,0);
        }
        int i=1;
        while(true){
            if(mp.get(i*k)==null){
                return i*k;
            }
            i++;
        }
    }
}