package Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);
		stack1.push(8);
		stack1.push(10);
		stack1.push(12);
		stack1.push(14);
		stack1.pop(); // to pop out the top Value that is 14
		stack1.push(3);
		
		System.out.println(stack1);
		System.out.println(stack1.peek()); // to show the Last element came to stack
		
		}

}
