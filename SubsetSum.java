
import java.util.* ;
import java.io.*; 
public class Solution {
    static ArrayList<Integer>ans;
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ans=new ArrayList<>();

        
        findSubSets(new ArrayList<>(),num,0);
         Collections.sort(ans);
        return ans;
    }
    public static void findSubSets(List<Integer>curr,int nums[],int index ){
        
        if(index == nums.length){
            int sum=0;
            for(int i=0;i<curr.size();i++){
                sum+=curr.get(i);
            }
            ans.add(sum);
            return;
        }
        curr.add(nums[index]);
        findSubSets(curr,nums,index+1);
        curr.remove(curr.size()-1);
        findSubSets(curr,nums,index+1);
    }

}