import java.util.*;
class occurance {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int max = 0;
        int ans = 0;
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            e.getKey();
            e.getValue();
            if(e.getValue()>max){
                max = e.getValue();
                ans = e.getKey();
            }
            else if(e.getValue()==max){
                ans = Math.min(e.getKey(),ans);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        occurance obj = new occurance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = obj.mostFrequentElement(nums);
        System.out.println("Most frequent element: " + result);
    }
}


