import java.util.*;
class lssumk{
    public int longestSubarray(int[] nums, int k) {
       int m=0,sum=0;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k)
            m=i+1;
            else{
                if(mpp.containsKey(sum))
                m=Math.max(m,i-mpp.get(sum));
                else 
                mpp.put(sum,i);
            }
        }
       return m;

    }
    public static void main(String[] args) {
        lssumk obj = new lssumk();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(obj.longestSubarray(nums, k));
    }
}