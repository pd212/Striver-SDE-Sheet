class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int l, int r )
    {
        // code here
         if(l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }

        
    }
    static int partition(int arr[], int l, int r)
    {
        // your code here
      int i = l ;int j = r;
      while(i < j){
          while(i<=r && arr[i] <= arr[l]){
              i++;
          }
          while(arr[j] > arr[l]){
              j--;
          }
          if(i < j){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j]= temp;
          }
      }
      int temp = arr[j];
      arr[j] = arr[l];
      arr[l] = temp;
      return j;
    } 
}