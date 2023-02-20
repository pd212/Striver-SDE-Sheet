import java.lang.*;

public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;





        // int ans = -1;
        // int mid = arr.length/2;
        // if(x < arr[mid]){
        //     for(int i=0;i<mid;i++){
        //         if(x == arr[i]){
        //             return i;
        //         }
        //     }
        // }
        // else if(x > mid){
        //     for(int i=mid;i<arr.length;i++){
        //         if(x == arr[i]){
        //             return i;
        //         }
        //     }
        // }
        //  return -1;
    }

}