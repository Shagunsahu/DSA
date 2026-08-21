import java.util.*;
class longestsubsequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1,l=0,s=nums[0];
        for(int i=1;i<nums.length;i++){
            if((nums[i]-1)==s)
            {
                c++;
                s=nums[i];
            }
            else{
                c=1;
                s=nums[i];
            }
            if(l<c)
                l=c;
        }
 return l;
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
        longestsubsequence obj=new longestsubsequence();
        int ans=obj.longestConsecutive(arr);
        System.out.println("The length of the longest consecutive subsequence is: " + ans);
    }
}