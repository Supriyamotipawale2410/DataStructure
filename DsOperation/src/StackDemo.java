import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		
		System.out.println(stack);
		
		int topElement = stack.peek();
		System.out.println("Top Element : " +topElement);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		stack.push(16);
		System.out.println(stack);
	}

}
