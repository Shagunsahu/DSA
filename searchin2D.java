import java.util.*;
class searchin2D {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n * m - 1;
        int mid ;
        while (low <= high) {
            mid = (low + high) / 2;
            int r = mid / m;
            int c = mid % m;
            if (mat[r][c] == target)
                return true;
            else if (mat[r][c] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        // Define 2D matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
         System.out.println("enter the column of array");
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Create object of Solution
        searchin2D obj = new searchin2D();

        // Call the method and print result
        if (obj.searchMatrix(mat, 8))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
