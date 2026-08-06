class Solution {
    public int stockBuySell(int[] arr, int n) {
         int min = Integer.MAX_VALUE;
       int max=0;
       for(int i=0;i<n;i++){
        if(arr[i]<min)
        min=arr[i];
        if((arr[i]-min)>max)
        max=arr[i]-min;
       }
       return max;
    }
}