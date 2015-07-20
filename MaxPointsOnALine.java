import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Point{
	int x;
	int y;
	Point(){
		x = 0;
		y = 0;
	}
	Point(int a, int b){
		x = a;
		y = b;
	}
}

public class MaxPointsOnALine{
	public int maxPoints(Point[] points){
		int res = 0;
		for(int i = 0;i<points.length;++i){
			int sameCount = 1;
			HashMap<Double, Integer> map = new HashMap<Double, Integer>();
			for(int j = i+1;j<points.length;++j){
				if(points[j].x==points[i].x && points[j].y==points[i].y){
					sameCount++;
				}
				else if(points[j].x==points[i].x){
					if(map.containsKey(Double.MAX_VALUE)){
						map.put(Double.MAX_VALUE, map.get(Double.MAX_VALUE)+1);
					}
					else{
						map.put(Double.MAX_VALUE, 1);
					}
				}
				else{
					double slope = (double)(points[j].y-points[i].y)/(points[j].x-points[i].x);
					if(slope==-0.0) slope = 0.0;
					if(map.containsKey(slope)){
						map.put(slope, map.get(slope)+1);
					}
					else{
						map.put(slope, 1);
					}
				}
			}
			Iterator it = map.entrySet().iterator();
			int localMax = 0;
			while(it.hasNext()){
				Map.Entry<Double, Integer> entry = (Map.Entry)it.next();
				localMax = Math.max(localMax, entry.getValue());
			}
			localMax += sameCount;
			res = Math.max(res, localMax);
		}
		return res;
	}
}