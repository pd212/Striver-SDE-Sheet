import java.util.*;
import java.lang.*;
public class Solution {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.
        Stack<Character>st=new Stack<>();
        char c1[]= expression.toCharArray();
        for(char c : c1){
            if(c == '(' || c =='{' || c=='['){
                st.push(c);
            }
            else{
                if(!st.empty() && isMatch(st.peek(),c)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (st.empty());
    }
    public static boolean isMatch(char open, char close){
        if(open == '(' && close ==')'){
            return true;
        }
         if(open == '{' && close =='}'){
            return true;
         }
         if(open == '[' && close ==']'){
            return true;
         }
        return false;
    }
}
