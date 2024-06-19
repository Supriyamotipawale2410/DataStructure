import java.util.Stack;
public class _03BracketsCheckStack
{
    public static void main(String[] args) {
        String exp = "({[24+6]}4+5(2-4))";
        if(expCheck(exp)) {
        	System.out.println("Balanced Brackets......");
        }
        else {
        	System.out.println("Check Brackets...Brackets are not balanced");
        }
    }
    public static boolean expCheck(String exp1) {
        Stack<Character> st = new Stack<>();
        Stack<Character> sn = new Stack<>();
        for(int i = 0; i < exp1.length(); i++){
            
            char ch = exp1.charAt(i);
            if(Character.isDigit(ch) || ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
            	sn.push(ch);
            }
            else if(st.isEmpty()){
                st.push(ch);
            }
            
            else if((ch==')' && st.peek() == '(')||(ch=='}' && st.peek() == '{')||(ch==']' && st.peek() == '[')){
                st.pop();
            }
            else{
                st.push(ch);
            }      
        }
        //System.out.println(st);
        System.out.println(sn);
        return (st.isEmpty());
    }
}