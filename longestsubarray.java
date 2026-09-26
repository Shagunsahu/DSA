import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class longestsubarray {
    public int longestSubarray(int[] nums, int k) {
        Map<Long, Integer> firstPosition = new HashMap<>();
        firstPosition.put(0L, -1);

        long prefixSum = 0;
        int bestLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            long neededPrefix = prefixSum - k;

            if (firstPosition.containsKey(neededPrefix)) {
                int startPosition = firstPosition.get(neededPrefix);
                bestLength = Math.max(bestLength, i - startPosition);
            }

            firstPosition.putIfAbsent(prefixSum, i);
        }

        return bestLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        longestsubarray sol = new longestsubarray();
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int k = sc.nextInt();
        int result = sol.longestSubarray(nums, k);
        System.out.println("Length of the longest subarray with sum " + k + ": " + result);
    }
}