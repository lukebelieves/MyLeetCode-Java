/*class Interval{
	int start;
	int end;
	Interval(){
		start = 0; end = 0;
	}
	Interval(int s, int e){
		start = s; end = e;
	}
}*/

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MergeIntervals{
	public List<Interval> merge(List<Interval> intervals){
		Comparator<Interval> comp = new Comparator<Interval>(){
			public int compare(Interval a, Interval b){
				if(a.start < b.start){
					return -1;
				}
				else if(a.start > b.start){
					return 1;
				}
				else{
					if(a.end < b.end){
						return -1;
					}
					else if(a.end > b.end){
						return 1;
					}
					else{
						return 0;
					}
				}
			}
		};
		int N = intervals.size();
		if(N<=1) return intervals;
		ArrayList<Interval> res = new ArrayList<Interval>();
		Collections.sort(intervals, comp);
		Interval last = intervals.get(0);
		for(int i = 0; i<N; ++i){
			if(intervals.get(i).start>last.end){
				res.add(last);
				last = intervals.get(i);
			}
			else{
				last.end = Math.max(last.end, intervals.get(i).end);
			}
		}
		res.add(last);
		return res;
	}
}