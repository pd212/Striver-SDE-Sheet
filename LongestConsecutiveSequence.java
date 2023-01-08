import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<Integer>();
        for(int n:nums){
            hs.add(n);
        }
        int sequence=0;
        for(int n:nums){
            if(!hs.contains(n-1)){
                int currSeq=1;
                int currNum=n;
                while(hs.contains(currNum+1)){
                    currSeq++;
                    currNum++;

                }
                sequence = Math.max(currSeq,sequence);
            }
        }
        return sequence;
    }

}