import java.util.* ;
import java.io.*; 
import java.lang.*;

public class Solution {

    static class MinStack {

       
        Stack<Integer>s1,ms;
        // Constructor
        MinStack() {
            // Write your code here.
            s1 = new Stack<>();
            ms = new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            
         s1.push(num);
         if(ms.empty() || ms.peek() >= num){
             ms.push(num);
         }

        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(!ms.empty() && ms.peek() == s1.peek()){
                 ms.pop();
            }
            int min=-1;
            if(!s1.empty()){
                min = s1.peek();
                s1.pop();
            }
            return min;
            
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
           int min = -1;
           if(!s1.empty()){
               min = s1.peek();
           }
           return min;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            int min= -1;
            if(!ms.empty()){
                min = ms.peek();
            }
            return min;
        }
    }
}

