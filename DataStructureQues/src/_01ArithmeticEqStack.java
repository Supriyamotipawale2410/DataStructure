import java.util.Stack;

public class _01ArithmeticEqStack {

	public static void main(String[] args) {
		
		String exp = "((2*3)*(2*3)+(2/0))";
		
		Stack<Integer> num = new Stack();						//operand stack
		Stack<Character> sign = new Stack();					//operator stack
	
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			
			if(Character.isDigit(c)) {                            //if digit
				int n =exp.charAt(i)-'0';
				num.push(n);
			}
			
			else if(c=='+' || c=='-' || c=='*' || c=='/') {        //if +,-,*,/
				sign.push(c);
			}
			else if(c==')') {										//if  -->  ')'
				while(!sign.isEmpty() && !num.isEmpty()) {//looping till both stack are not empty
				int a = num.pop();									//pop operand
				int b = num.pop();									//pop operand
				char op =sign.pop();								//pop operator
				
				switch(op) {
				case '+' :									//if + -->add & push result to operand
					int add=a+b;
					num.push(add);
					break;
				case '-' :									//if - -->subtract & push result to operand
					int sub=b-a;
					num.push(sub);
					break;
				case '*' :									//if * -->multiply & push result to operand
					int mul=a*b;
					num.push(mul);
					break;
				case '/' :									//if / -->divide & push result to operand
					if(a==0) {
						System.out.println("can not divide by 0");
					}
					else {
					int div =b/a;
					num.push(div);	
					break;
					}
					}
				}
		}
			//to check stack operations
		//	System.out.println(num);
		//	System.out.println(sign);
			
		}
		//print Result
		System.out.println("Result of "+exp+ " : "+num);
		//System.out.println(sign);
}
}
		
	


