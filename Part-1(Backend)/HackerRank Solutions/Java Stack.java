import java.util.*;

class Solution {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
        // Initializing stack
		Stack<Character> st = new Stack<>();
		while(sc.hasNext()) {
			String s = sc.next();
            //Complete the code
            boolean balanced = true;
            for(char c : s.toCharArray()) {
                if(c == '(' || c == '{' || c == '[') {
                    st.push(c);
                }
                else if(!st.isEmpty() && c == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if(!st.isEmpty() && c == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if(!st.isEmpty() && c == ']' && st.peek() == '[') {
                    st.pop();
                }
                else {
                    balanced = false;
                    System.out.println("false");
                    break;
                }
            }
            if(balanced) {
                if(st.isEmpty())
                    System.out.println("true");
                else {
                    System.out.println("false");
                    st.clear();
                }
            }
        }
	}
}