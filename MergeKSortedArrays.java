
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<k;i++){
//             ArrayList<Integer>temp= new ArrayList<>(kArrays.get(i));
//             for(int j=0;j<temp.size();j++){
//                 ans.add(temp.get(j));
//             }
            //another approach
            for(int j=0;j<kArrays.get(i).size();j++){
                ans.add(kArrays.get(i).get(j));
            }
        }
        Collections.sort(ans);
        return ans;
	}
}
