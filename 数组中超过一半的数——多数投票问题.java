import java.util.HashMap;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int N = array.length;
        if(N == 0) return 0;
        int majority = array[0];
        int cnt = 1;
        for(int i = 1; i < N; i++){
            if(cnt == 0){
                majority = array[i];
                cnt = 1;
            }
            cnt = array[i] == majority?cnt+1:cnt-1;
        }
        cnt = 0;
        for(int i : array){
            if(i == majority)
                cnt++;
        }
        return 2*cnt > N ? majority : 0;
    }
}