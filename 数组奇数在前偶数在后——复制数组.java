public class Solution {
    public void reOrderArray(int [] array) {
        if(array.length == 0) return;
        int oddCnt = 0;
        for(int item : array){
            if(item%2 == 1)
                oddCnt++;
        }
        int[] copy = array.clone();
        int i = 0, j = oddCnt;
        for(int item : copy){
            if(item%2 == 1)
                array[i++] = item;
            else
                array[j++] = item;
        }
    }
}