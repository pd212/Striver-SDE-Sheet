import java.util.ArrayList;
import java.util.List;

class Solution {
    public void subsets(List<List<Integer>>ans,List<Integer>curr,int[] nums,int index){
        if(ans.contains(curr)) return;
        
        if(index == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subsets(ans,curr,nums,index+1);
        curr.remove(curr.size()-1);
        subsets(ans,curr,nums,index+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        subsets(ans,new ArrayList<>(),nums,0);
        return ans;
    }

}