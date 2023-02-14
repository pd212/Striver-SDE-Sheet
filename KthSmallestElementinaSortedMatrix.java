import java.util.*;


class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix[0].length;
        int m = matrix.length;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr.add(matrix[i][j]);
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);
    }
}
