/* Program to merge given overlapping intervals
 * @Muskan, 1910990681
 * Date : 02/10/2021
 * Weekly Challenge 2 Arrays
 */

/*
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        int i = 0;
        int j = 0;
        int size = 0;
        int nextIndex = i + 1;
        Interval current;
        Interval next; 
        Interval swap = intervals.get(0);

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start)); // checked from hint

        // for( i = 0; i < intervals.size() - 1; i++){

        //     for (j = 0; j < (intervals.size() - i - 1); j++){

        //         current = intervals.get(j);
        //         next = intervals.get(j + 1);

        //         if(current.start > next.start){
        //             swap = current;
        //             current = next;
        //             next = swap;
        //         }
        //     }
        // }

        i = 0;

        while(i < intervals.size() - 1){
            
            size = intervals.size();
            nextIndex = i + 1;

            current = intervals.get(i);
            next = intervals.get(nextIndex);

            if(Math.max(current.start, next.start) <= Math.min(current.end, next.end)){

                current.start = (Math.min(current.start, next.start));
                current.end = (Math.max(current.end, next.end));
                intervals.remove(nextIndex);
                continue;

            } 

            i++;
        }

        return intervals;
    }
}

