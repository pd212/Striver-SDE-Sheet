import java.util.* ;
import java.io.*; 
public class Solution {


	public static void sorted(Stack<Integer>st,int x){
		if(st.empty() || x > st.peek()){
			st.push(x);
			return;
		}
		int top = st.pop();
		sorted(st,x);
		st.push(top);
        
	}
	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(!stack.empty()){
			int n = stack.pop();

			sortStack(stack);

			sorted(stack,n);
		}
	}

}