import java.util.ArrayList;
public class Solution {
    public void reOrderArray(int [] array) {
        if(array.length == 0) return;
        //保存奇数和偶数
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for(int i : array){
            if(i%2 == 0)
                evens.add(i);
            else
                odds.add(i);
        }
        int evenCnt = evens.size();
        int oddCnt = odds.size();
        if(evenCnt== 0 || oddCnt == 0) return;
        //将奇数和偶数分别复制到原数组即可
        int index = 0;
        for(int i : odds){
            array[index++] = i;
        }
        for(int i : evens){
            array[index++] = i;
        }
    }
}