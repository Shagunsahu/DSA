import java.util.*;

class duplicate {
    // find the duplicate using a frequency array
    static int findDuplicate(int[] arr) {
        // get size
        int n = arr.length;
        // allocate frequency array initialized to 0
        int[] freq = new int[n + 1];
        // scan elements
        for (int i = 0; i < n; i++) {
            // return current value if already seen
            if (freq[arr[i]] == 0) {
                // mark as seen
                freq[arr[i]] += 1;
            } else {
                // duplicate found
                return arr[i];
            }
        }
        // fallback if none (per original)
        return 0;
    }

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array:");
int n =sc.nextInt();
        // declare and initialize array
        int[] arr = new int[n];
System.out.println("Enter elements of array:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
        // print result
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}