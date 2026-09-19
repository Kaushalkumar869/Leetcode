class Solution {
    public boolean isValid(String s) {

        // public boolean isValid(String s) {
        // int old = -1; // solve using Without Stack
        // int n = s.length();
        // while(old!=n){
        //    s =  s.replace("[]","");
        //    s = s.replace("{}","");
        //    s = s.replace("()","");
        //     System.out.println(s);
        //     n = s.length();
        // }
        // return s.isEmpty();

    Stack<Character> st = new Stack<>(); // Solve Using Stack Method
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if (ch == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if (ch == ']' && st.peek() == '[') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}