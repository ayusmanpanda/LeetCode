class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int temp= nums[0]+1;
        for(int i=1;i<n;i++){
            while(temp<nums[i]){
                ans.add(temp);
                temp++;
            }
            temp = nums[i] + 1;
        }
        return ans;
    }
}