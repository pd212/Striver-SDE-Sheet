
import java.util.ArrayList;


public class Solution {
public static int removeDuplicates(ArrayList<Integer> arr,int n) {
	 int i = 0;
        int j = 1;
        while (j < n) {
            while (j < n && arr.get(i).equals(arr.get(j))) {
                j++;
            }
            if (j < n) {
                i++;
                arr.set(i, arr.get(j));
                j++;
            }
        }
        return i + 1;
    }
}