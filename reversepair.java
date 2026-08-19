import java.util.*;
class reversepair{
    public int reversePairs(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>2*nums[j])
                c++;
            }
        }
        return c;
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
        reversepair obj=new reversepair();
        int ans=obj.reversePairs(arr);
        System.out.println("The number of reverse pairs is: " + ans);
    }
}