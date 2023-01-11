
class Solution {
    List<List<Integer>>ans;
    List<Integer>currCombination;
    int arr[];
    public void findingCombination(int target, int lastEleIndex){
        if(target == 0){
            ans.add(new ArrayList<>(currCombination));
            return;
        }
        
        for(int i=lastEleIndex;i<arr.length;i++){
            if(target >= arr[i]){
                currCombination.add(arr[i]);
                
                findingCombination((target - arr[i]),i);
                
                currCombination.remove(currCombination.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        currCombination = new ArrayList<>();
        arr = new int[candidates.length];
        for(int i=0;i<candidates.length;i++){
            arr[i] = candidates[i];
        }
        findingCombination(target,0);
        return ans;
    }
}