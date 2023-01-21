import java.lang.*;
import java.util.*;
public class Queue {
    // Define the data members(if any) here.
    Stack<Integer>s1;
    Stack<Integer>s2;
    Queue() {
        s1=new Stack<>();
        s2=new Stack<>();
        // Initialize your data structure here.
        
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        s1.push(val);
    }

    int deQueue() {
        // Implement the dequeue() function.
        if(s1.isEmpty() && s2.isEmpty()){
            return -1;
        }
        else if(!s2.empty()){
            return s2.pop();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
    }

    int peek() {
        // Implement the peek() function here.
         if(s1.isEmpty() && s2.isEmpty()){
            return -1;
         }
        else if(!s2.empty()){
            return s2.peek();
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return (s1.isEmpty() && s2.isEmpty());
    }
}
