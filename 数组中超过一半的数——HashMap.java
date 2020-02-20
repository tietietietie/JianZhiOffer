public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int N = array.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            if(map.containsKey(i)){
                int val = map.get(i);
                map.put(i,++val);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i : map.keySet()){
            if(2*map.get(i) > N)
                return i;
        }
        return 0;
    }
}