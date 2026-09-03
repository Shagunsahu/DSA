import java.util.*;
class Solution {
    // Function to rotate matrix 90 degrees clockwise in-place
    public void rotateClockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

// Driver class
class rotatematrix{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
          System.out.print( "Enter no.of rows: ");
         int r=sc.nextInt();
int matrix[][]=new int[r][r];
          System.out.print( "Enter elements.of matrix: ");
        for (int i=0;i<r;i++) {
            for (int j=0;j<r;j++)
             matrix[i][j]=sc.nextInt();
        }
        Solution ob = new Solution();
        ob.rotateClockwise(matrix);// object creation

        // Print rotated matrix
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}