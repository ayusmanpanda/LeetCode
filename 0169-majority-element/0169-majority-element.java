class Solution {
    public int majorityElement(int[] nums) {
        //USING HASHMAP
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int n = nums.length;
        // for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        //     if(map.get(num)>n/2){
        //         return num;
        //     }
        // }
        // return -1;

        //USING SORTING (Ayusman)
        // Arrays.sort(nums);
        // int n = nums.length;
        // if(n==1) return nums[0];
        // int max =0;
        // int count =0;
        // for(int i=0;i<n;i++){
        //     if(i<n-1 && nums[i]!=nums[i+1]){
        //         count+=1;
        //         max = Math.max(count,max);
        //         count=0;
        //     }
        //     else if(i==n-1 && nums[i]==nums[i-1]){
        //         count++;
        //         max = Math.max(count,max);
        //     }
        //     else count++;
        //     if(max>n/2) return nums[i];
        // }
        // return -1;

        // SORTING CHATGPT
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // BOyer_Moore Algorithm]
        int count =0;
        int value=0;
        for(int i:nums){
            if(count==0){
                value= i;
            }
            count += i==value? 1:-1;
        }
        return value;
    }
}