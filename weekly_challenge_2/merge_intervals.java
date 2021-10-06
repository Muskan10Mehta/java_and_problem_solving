/* Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary)
 * @Muskan, 1910990681
 * Date: 06/10/2021
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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        int i = 0;
        Interval current;

        while(i < intervals.size()){

            current = intervals.get(i);

            if(current.end < newInterval.start){

                i++;

            }else if(current.start > newInterval.end){

                //case where it is not overlapping
                intervals.add(i, newInterval);
                break;

            }else{

                //case with overlap
                newInterval.start = Math.min(current.start, newInterval.start);
                newInterval.end = Math.max(current.end, newInterval.end);
                intervals.remove(i);
            }
        }

        // if the interval doesn't overlap or fit anywhere add at end
        if(i == intervals.size()){
            intervals.add(newInterval);
        }

        return intervals;
    }
}

