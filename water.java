import java.util.*;

class water {
  
    public int trap(int[] height) {
        int n = height.length;
        
        int left = 0;
        int right = n - 1;
        
        
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;
        
        
        while (left <= right) {
            
            if (height[left] <= height[right]) {
                
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
            
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
            
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
            
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        

        return totalWater;
    }

    public static void main(String[] args) {
        
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        
        water sol = new water();
        
        int result = sol.trap(height);
        System.out.println("Trapped Rainwater: " + result);
    }
}
