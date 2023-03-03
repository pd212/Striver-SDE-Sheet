import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;

        Boolean col[] = new Boolean[m];
        Boolean row[] = new Boolean[n];

        for(int i=0;i<n;i++){
            row[i] = false;
        }
         for(int i=0;i<m;i++){
            col[i] = false;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    row[i] = col[j] = true;
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
         }
    }

}