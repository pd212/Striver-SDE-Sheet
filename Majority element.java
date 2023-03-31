import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int ans=-1;
		Map<Integer,Integer>map = new HashMap<>();
		for(int i : arr){
			map.put(i, map.getOrDefault(i,0)+1);
		}
		for(int i : map.keySet()){
			if(map.get(i) > n/2 ){
				
				return i;
			}
		}
		return ans;
	}
}