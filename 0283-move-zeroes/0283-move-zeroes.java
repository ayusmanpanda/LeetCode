// class Solution {
//     public void moveZeroes(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-i-1;j++){
//                if(nums[j]==0 && nums[j+1]!=0){
    //                 int temp = nums[j];
    //                 nums[j]= nums[j+1];
    //                 nums[j+1]=temp;
//                 } 
//             }
            
//         }
//     }
// }

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int lastNonZero = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 int temp = nums[i];
//                 nums[i] = nums[lastNonZero];
//                 nums[lastNonZero] = temp;
//                 lastNonZero++;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] arr) {
        int n= arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
    }
}
