import java.util.Stack;

public class EvaluateReversePolishNotation{
	public int evalRPN(String[] tokens){
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < tokens.length; ++i){
			if(tokens[i].compareTo("+") != 0 && tokens[i].compareTo("-") != 0 && tokens[i].compareTo("*") != 0 && tokens[i].compareTo("/") != 0){
				stack.push(Integer.parseInt(tokens[i]));
			}
			else{
				int op2 = stack.pop();
				int op1 = stack.pop();
				if(tokens[i].compareTo("+") == 0){
					stack.push(op1 + op2);
				}
				else if(tokens[i].compareTo("-") == 0){
					stack.push(op1 - op2);
				}
				else if(tokens[i].compareTo("*") == 0){
					stack.push(op1 * op2);
				}
				else{
					stack.push(op1 / op2);
				}
			}
		}
		int res = stack.pop();
		return res;
	}
}