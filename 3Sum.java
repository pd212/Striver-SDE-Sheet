import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        int n=arr.length;
        Arrays.sort(arr);
        LinkedList<List<Integer>>ans=new LinkedList<List<Integer>>();
        for(int i=0;i<=n-3;i++){
            int target= -arr[i];
            int l=i+1,r=n-1;
            int sum=0;
            while(l<r){
                sum= arr[l]+arr[r];
                if(sum > target){
                    r--;
                }
                else if(sum < target){
                    l++;
                }
                else{
                    LinkedList<Integer>ll=new LinkedList<>();
                    ll.add(arr[i]);
                    ll.add(arr[l]);
                    ll.add(arr[r]);
                    ans.add(ll);
                    while(l < r && arr[l] == arr[l + 1]){
                        l++;
                    }
                    l++;
                    while(l < r && arr[r] == arr[r - 1]){
                        r--;
                    }
                    r--;
                }
            }
            while(i<=n-3 && arr[i]==arr[i+1]){
                i++;
            }
        }
        return ans;
    }
}