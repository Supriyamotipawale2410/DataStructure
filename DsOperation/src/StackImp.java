import java.util.Stack;

public class StackImp {
	
		public static int evaluation(String s) {
			Stack<Integer> st = new Stack<Integer>();
			int x=0, y=0;
			char ch[] = s.toCharArray();
			for(char c : ch) {
				if(c >= '0' && c<= '9') {
					st.push((int)(c - '0'));
				}
				else {
					y= st.pop();
					x= st.pop();
					switch(c) {
					case '+' :
						st.push(x+y);
						break;
					case '-' :
						st.push(x-y);
						break;
					case '*' :
						st.push(x*y);
						break;
					case '/' :
						st.push(x/y);	
						break;
					}
				}
			}
			
			return st.pop();
		}
	}

