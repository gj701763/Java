package DSA_In_Java.Matrix;

import java.util.*;

/*
6. Merge Intervals (LC 56)
Description: Merge overlapping intervals.
Example:
 Input: [[1,3],[2,6],[8,10]]
 Output: [[1,6],[8,10]]
Approach (ArrayList):
Sort intervals by start
Merge overlapping ones into result list
*/
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] nextInterval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            if (nextStart <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = nextInterval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1,3},{2,6},{8,10} };
        int merge[][] = merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge[0].length; j++) {
                System.out.print(merge[i][j] + " ");
            }
            System.out.println();
        }
    }
}
