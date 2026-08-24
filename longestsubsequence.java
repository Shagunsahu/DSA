import java.util.*;
class longestsubsequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int current = 1;
        int longest = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                current = 1;
            }

            if (current > longest) {
                longest = current;
            }
        }

        return longest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longestsubsequence obj = new longestsubsequence();
        int ans = obj.longestConsecutive(arr);
        System.out.println("The length of the longest consecutive subsequence is: " + ans);
    }
}