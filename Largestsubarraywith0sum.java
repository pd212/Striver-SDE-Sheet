import java.util.HashMap;

class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i=-1;
        int Maxlen = 0;
        int sum =0;
        hm.put(sum,i);
        while(i < n-1){
            i++;
            sum += arr[i];
            if(hm.containsKey(sum) == false){
                hm.put(sum,i);
            }
            else{
                int len = i - hm.get(sum);
                if(len > Maxlen){
                    Maxlen = len;
                }
            }
        }
         
        return Maxlen;
    }
}