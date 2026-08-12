class repeating {
    public int[] findMissingRepeatingNumbers(int[] nums) {
    int n=nums.length;
    int sum=0,square=0;
    for(int i=0;i<n;i++){
    sum=sum+nums[i];
    square+=(nums[i]*nums[i]);
    }
    int s=(n* (n + 1)) / 2;
    int dif=(sum-s);//x-y
    int sq=(n * (n + 1) * (2*n + 1)) / 6;
    int add=(square-sq)/dif;//x+y
    int a[]=new int[2];
    a[0]=(add+dif)/2;
    a[1]=add-a[0];
     return a;
    }
}