import java.util.*;

class frequency {
    public int sumHighestAndLowestFrequency(int[] nums) {
        Arrays.sort(nums);

        int lowest = Integer.MAX_VALUE;
        int highest = 0;
        int index = 0;

        while (index < nums.length) {
            int next = index;

            while (next < nums.length && nums[next] == nums[index]) {
                next++;
            }

            int count = next - index;
            lowest = Math.min(lowest, count);
            highest = Math.max(highest, count);
            index = next;
        }

        return lowest + highest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        frequency obj = new frequency();
        int result = obj.sumHighestAndLowestFrequency(nums);
        System.out.println("Sum of highest and lowest frequency: " + result);
    }
}