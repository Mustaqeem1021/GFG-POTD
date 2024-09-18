class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
          Stack<Character> st = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                char pop = st.pop();

                if ((c == ')' && pop != '(') || (c == ']' && pop != '[') || (c == '}' && pop != '{')) {
                    return false;
                }
            }

        }
        return st.empty();
    }
}
