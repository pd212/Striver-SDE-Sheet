import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class PairSum{
    public int[] twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(target - arr[i])){
                ans[0]=hm.get(target -arr[i]);
                ans[1]= i;
                return ans;
            }
            else{
                hm.put(arr[i], i);
            }
        }
        return ans;
    }
}