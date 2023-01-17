import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
         HashMap<Integer,Integer>hm=new HashMap<>();
        int i=-1,n=arr.size();
        int Maxlen = 0;
        int sum =0;
        hm.put(sum,i);
        while(i < n-1){
            i++;
            sum += arr.get(i);
            if(hm.containsKey(sum) == false){
                hm.put(sum,i);
            }
            else{
                int len = i - hm.get(sum);
                if(len > Maxlen){
                    Maxlen = len;
                }
            }
        }  
        return Maxlen;
	}
}