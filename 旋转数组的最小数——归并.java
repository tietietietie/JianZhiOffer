import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) return 0;
        int low = 0, high = array.length-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(array[mid] < array[high]) high = mid;
            else if(array[mid] > array[high]) low = mid+1;
            else high--;
        }
        return array[low];
    }
}