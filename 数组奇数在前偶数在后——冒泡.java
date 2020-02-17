public class Solution {
    public void reOrderArray(int [] array) {
        int N = array.length;
        for(int i = N-1; i > 0; i--)
            for(int j = 0; j < i; j++)
                if(array[j]%2 == 0 && array[j+1]%2 != 0)
                    swap(array,j,j+1);
        return;
    }
    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}