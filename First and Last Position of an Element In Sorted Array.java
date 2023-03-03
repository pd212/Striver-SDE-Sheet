import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.

        int first = -1;
        int last = -1;

        for(int i=0;i<n;i++){
            if(arr.get(i) == k){
                if(first == -1){
                    first = i;
                    last = i;
                }else{
                    last = i;
                }
            }
        }
        return new int[]{first,last};


        // int ans[] = new int[2];
        // ans[0] = -1;
        // ans[1]=-1;
        // for(int i=0;i<n;i++){
        //     if(arr.get(i) == k){
        //         ans[0] = i;
        //         break;
        //     }
        // }
        // for(int i=n-1;i>=0;i--){
        //     if(arr.get(i) == k){
        //         ans[1] = i;
        //         break;
        //     }
        // }
        // return ans;
    }

};
