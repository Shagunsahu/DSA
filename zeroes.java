import java.util.*;
class zeroes {
    public void sortZeroOneTwo(int[] nums) {
        int low=0,mid=0;
        int high=nums.length-1;
        
        while (mid <= high) {
            // If current element is 0, swap with low and move both low and mid forward
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            // If current element is 1, just move mid forward
            else if (nums[mid] == 1) {
                mid++;
            }
            // If current element is 2, swap with high and move only high backward
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
for(int i=0;i<nums.length;i++){
    System.out.print(nums[i] + "\t");
}
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array");
int n=sc.nextInt();
int m[]=new int[n];
System.out.println("enter the array");
 for(int i=0;i<n;i++){
m[i]=sc.nextInt();
}
zeroes ob=new zeroes();
ob.sortZeroOneTwo(m);
}

}