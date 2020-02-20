public class Solution {
    private int max;
    public int FindGreatestSumOfSubArray(int[] array) {
        max = array[0];
        FindGreatestSumOfSubArray(array,array.length-1);
        return max;
    }
    private int FindGreatestSumOfSubArray(int[] array, int idx){
        if(idx == 0) return array[idx];
        int preSum = FindGreatestSumOfSubArray(array,idx-1);
        int curSum = preSum > 0 ? preSum+array[idx] : array[idx];
        max = Math.max(curSum,max);
        return curSum;
    }
}