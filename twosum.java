import java.util.*;
class twosum{
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sum=0,l=0,r=n-1;
        int num[][]=new int[n][2];
        for(int i=0;i<n;i++){
            num[i][0]=nums[i];
            num[i][1]=i;
                }
                int res[]={-1,-1};
        Arrays.sort(num, (a, b) -> Integer.compare(a[0], b[0]));
        while(l<r){
            sum=num[l][0]+num[r][0];
            if(sum==target){
                res[0]=l;
                res[1]=r;
            return res;
        }
            else if(sum<target)
            l++;
            else 
            r--;
        }
       return res;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target=sc.nextInt();
        twosum obj=new twosum();
        int ans[]=obj.twoSum(arr,target);
        if(ans[0]==-1 && ans[1]==-1)
        System.out.println("No such pair exists.");
        else
        System.out.println("The indices of the two numbers are: " + ans[0] + " and " + ans[1]);
    }
}