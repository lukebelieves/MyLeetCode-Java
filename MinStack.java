import java.util.Stack;

public class MinStack{
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();	//keep top one as the minimum
	public void push(int x){
		stack.push(x);
		if(minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);	//<= instead of <
	}
	public void pop(){
		int temp = stack.pop();
		if(temp==minStack.peek()) minStack.pop();
	}
	public int top(){
		return stack.peek();
	}
	public int getMin(){
		return minStack.peek();
	}
}