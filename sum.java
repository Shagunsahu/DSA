class sum {
    public int arraySum(int[] nums) {
        long total = 0L;
        for (int value : nums) {
            total += value;
        }
        return (int) total;
    }
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5};
        sum obj = new sum();
        int result = obj.arraySum(nums);
        System.out.println("Sum of array elements: " + result);
    }
}