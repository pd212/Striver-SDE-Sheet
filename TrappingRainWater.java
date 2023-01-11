
class Solution {
    public int trap(int[] arr) {
        int sum=0;
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int x:left){
            System.out.print(x+"");
        }
        System.out.println();
        right[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]); 
        }
         for(int x:right){
            System.out.print(x+"");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            sum += Math.abs((Math.min(left[i],right[i]) - arr[i]));
            System.out.print(sum+"");
        }
        return sum;
    }

    //o(n)time and o(1)space
    // public int trap(int[] height){
    //     int n = height.length;
    //     int lbar = height[0], rbar = height[n-1];
    //     int  l = 1, r = n - 2;
    //     int totalWater = 0;
    //     while(l <= r)
    //     {
    //         if(lbar <= rbar)
    //         {
    //             if(lbar <= height[l])
    //             {
    //                 lbar = height[l];
    //             }
    //             else
    //             {
    //                 totalWater += (lbar - height[l]);
    //             }
    //             l++;
    //         }
    //         else 
    //         {
    //             if(rbar <= height[r])
    //             {
    //                 rbar = height[r];
    //             }
    //             else
    //             {
    //                 totalWater += (rbar - height[r]);
    //             }
    //             r--;
    //         }
    //     }
    //     return totalWater;
    // }
}