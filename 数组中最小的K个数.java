import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Comparator;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(k > input.length) return ans;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k+1,new                    Comparator<Integer>(){
            @Override
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }
        });
        for(int i : input){
            pq.offer(i);
            if(pq.size() > k)
                pq.poll();
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }
}