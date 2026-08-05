// BRUTE FORCE
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[]arr= new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     arr[0]=i;arr[1]=j;
//                 }
//             }
//         }
//         return arr;
//     }
// }

// CODE 2
class Solution{
    public int[] twoSum(int[] nums, int target) {
        // int[] ans={-1};
        // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int partner = target -nums[i];
        //     if(mp.containsKey(partner)){
        //         ans = new int[]{i,mp.get(partner)};
        //         return ans;
        //     }
        //     mp.put(nums[i],i);
        // }
        // return ans;

        // Failed solution*
        int[] ans={-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if(mp.containsKey(temp)){
                ans = new int[]{mp.get(temp),i};
                return ans;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return ans;
    }
}