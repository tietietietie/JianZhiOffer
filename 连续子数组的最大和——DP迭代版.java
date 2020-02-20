public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) return 0;
        int N = array.length;
        int cur = array[0];
        int max = cur;
        for(int i  = 1; i < N; i++){
            if(cur < 0)
                cur = 0;
            cur += array[i];
            max = Math.max(cur,max);
        }
        return max;
    }
}