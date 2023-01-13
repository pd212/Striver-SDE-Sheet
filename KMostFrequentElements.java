
import java.util.* ;
import java.io.*;
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x : arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
       
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            pq.add(new int[]{e.getKey(), e.getValue()});
            while (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }
        return result;
        
        //O(n)both time and space
//         Map<Integer, Integer> map = new HashMap<>();

//         // Build map where the key is element
//         // and value is how often this element appears in 'ARR'.
//         for (int ele : arr) {

//             map.put(ele, map.getOrDefault(ele, 0) + 1);
//         }

//         List<Integer>[] bucket = new List[n + 1];

//         for (int key : map.keySet()) {

//             int freq = map.get(key);

//             if (bucket[freq] == null) {

//                 bucket[freq] = new LinkedList<>();
//             }

//             // Add in correct bucket.
//             bucket[freq].add(key);
//         }

//         int[] ans = new int[k];
//         int cur = 0;

//         // Add 'K' elements to answer array starting from the rightmost bucket.
//         for (int i = bucket.length - 1; i > 0 && k > 0; i--) {

//             if (bucket[i] == null) {
//                 continue;
//             }

//             for (int num : bucket[i]) {

//                 ans[cur++] = num;
//                 k--;
//             }
//         }

//         return ans;
//     }

}
}

