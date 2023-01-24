import java.util.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() >= arr.get(i)){
                st.pop();
            }
            ans.add(st.isEmpty() ? -1 : st.peek());
            st.push(arr.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }
}