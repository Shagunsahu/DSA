import java.util.*;

class mergeintervals{
    public int[][] merge(int[][] intervals) {
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // Overlap condition: current start <= previous end
            if (intervals[i][0] <= prev[1]) {
                // Merge intervals
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                // No overlap, add previous interval to result
                merged.add(prev);
                prev = intervals[i];
            }
        }

        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of intervals: ");    
    int n = sc.nextInt();
    int[][] intervals = new int[n][2];
    System.out.println("Enter the intervals:");
    for (int i = 0; i < n; i++) {
        intervals[i][0] = sc.nextInt();
        intervals[i][1] = sc.nextInt();
    }
    mergeintervals obj = new mergeintervals();
    int[][] merged = obj.merge(intervals);
    System.out.println("Merged intervals:");
    for (int[] interval : merged) {
        System.out.println(interval[0] + " " + interval[1]);
    }
    }
}