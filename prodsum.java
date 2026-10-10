import java.util.*;
class prodsum {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;

        while (right < n) {
            product *= nums[right];
            while (product >= k) product /= nums[left++];
            count += 1 + (right - left);
            right++;
        }

        return count;
    }
    public static void main(String args[]) {
        int[] nums = {};
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        nums = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        k = sc.nextInt();
        prodsum obj = new prodsum();
        int result = obj.numSubarrayProductLessThanK(nums, k);
        System.out.println("Number of contiguous subarrays with product less than " + k + ": " + result);
    }
}