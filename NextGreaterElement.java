import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer>st=new Stack<>();
		st.push(arr[n-1]);
		arr[n-1] = -1;
		for(int i=n-2;i>=0;i--){
			int temp = arr[i];
			while(!st.isEmpty() && arr[i] >= st.peek()){
				st.pop();
			}
			if(!st.isEmpty()){
				arr[i] = st.peek();
			}
			if(st.isEmpty()){
				arr[i] = -1;
			}
			st.push(temp);

		}
		return arr;
	}

}
