import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) return 0;
        int ans = array[0];
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                ans = array[i+1];
                break;
            }
        }
        return ans;
    }
}