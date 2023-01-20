import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.

     Queue<Integer>q;
     
    public Stack() {
        // Implement the Constructor.
         q=new LinkedList<>();   
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        q.add(element);
        for(int i=1;i<q.size();i++){
            q.add(q.poll());
        }
        
    }

    public int pop() {
        // Implement the pop() function.
        if(isEmpty()){
            return -1;
        }
        return q.poll();
        
    }

    public int top() {
        // Implement the top() function.
        if(isEmpty()){
            return -1;
        }
       return q.peek();
    }
}

