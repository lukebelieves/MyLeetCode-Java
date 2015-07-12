public class GasStation{
	public int canCompleteCircuit(int[] gas, int[] cost){
		int N = gas.length;
		int start = 0;
		while(start < N){
			int temp = 0;
			boolean fail = false;
			for(int step=0; step < N; ++step){
				temp += gas[(start+step) % N]-cost[(start+step) % N];
				if(temp<0){
					fail = true;
					start += step+1;
					break;
				}
			}
			if(!fail) return start;
		}
		return -1;
	}
}