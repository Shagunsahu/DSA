import java.util.*;
public class sortcolors {
 public void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length - 1;
    while (mid <= high) {
        if (nums[mid] == 0) {
            int tmp = nums[low];
            nums[low++] = nums[mid];
            nums[mid++] = tmp;
        } else if (nums[mid] == 1) {
            mid++;
        } else {
            int tmp = nums[mid];
            nums[mid] = nums[high];
            nums[high--] = tmp;
        }
    }
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter the elements (0, 1, or 2):");
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }
    sortcolors obj = new sortcolors();
    obj.sortColors(nums);
    System.out.println("Sorted colors:");
    for (int num : nums) {
        System.out.print(num + " ");
    }  
}
}
