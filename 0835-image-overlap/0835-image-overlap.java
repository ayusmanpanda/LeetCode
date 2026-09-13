class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n= img1.length;
        List<int[]> arr1= new ArrayList<>();
        List<int[]> arr2= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1) arr1.add(new int[]{i,j});
                if(img2[i][j]==1) arr2.add(new int[]{i,j});
            }
        }
        Map<String,Integer> mp = new HashMap<>();
        int ans=0;
        for(int[] a: arr1){
            for(int[] b:arr2){
                String shift= (b[0]-a[0])+","+(b[1]-a[1]);
                int count= mp.getOrDefault(shift,0)+1;
                mp.put(shift,count);
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}