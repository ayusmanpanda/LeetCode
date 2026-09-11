// class Solution {
//     public int totalNumbers(int[] digits) {
//         int[] freq= new int[10];
//         int n = digits.length;
//         for(int i:digits){
//             freq[i]++;
//         }
//         int ans=0;
//         for(int i=0;i<)
//     }
// }
class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        int ans = 0;

        for (int a = 1; a <= 9; a++) {       // hundreds
            for (int b = 0; b <= 9; b++) {   // tens
                for (int c = 0; c <= 8; c += 2) { // units
                   
                    if (freq[a] == 0) continue;
                    freq[a]--;

                    if (freq[b] == 0) {
                        freq[a]++;
                        continue;
                    }
                    freq[b]--;

                    if (freq[c] == 0) {
                        freq[a]++;
                        freq[b]++;
                        continue;
                    }

                    ans++;

                    freq[a]++;
                    freq[b]++;
                }
            }
        }

        return ans;
    }
}