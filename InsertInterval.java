import java.util.List;
import java.util.ListIterator;

class Interval{
	int start;
	int end;
	Interval(){
		start = 0;
		end = 0;
	}
	Interval(int s, int e){
		start = s;
		end = e;
	}
}

public class InsertInterval{
	public List<Interval> insert(List<Interval> intervals, Interval newInterval){
		ListIterator<Interval> i = intervals.listIterator();
		while(i.hasNext()){
			Interval in = i.next();
			if(newInterval.end < in.start){
				i.previous();
				break;
			}
			if(newInterval.end >= in.start && newInterval.start <= in.end){
				newInterval.start = Math.min(newInterval.start, in.start);
				newInterval.end = Math.max(newInterval.end, in.end);
				i.previous();
				i.remove();
			}
		}
		i.add(newInterval);
		return intervals;
	}
}