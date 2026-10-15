import java.util.Scanner;

class shortest {
    public int findUnsortedSubarray(int[] A) {
    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
    for (int i=1;i<n;i++) {
      max = Math.max(max, A[i]);
      min = Math.min(min, A[n-1-i]);
      if (A[i] < max) end = i;
      if (A[n-1-i] > min) beg = n-1-i; 
    }
    return end - beg + 1;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt(); 
    int[] A = new int[n];
    System.out.println("Enter the elements:");
    for(int i = 0; i < n; i++) {
        A[i] = sc.nextInt();
    }
    shortest obj = new shortest();
    int length = obj.findUnsortedSubarray(A);
    System.out.println("Length of shortest unsorted continuous subarray: " + length);
    
}
}