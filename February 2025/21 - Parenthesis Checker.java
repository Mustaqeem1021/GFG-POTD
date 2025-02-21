class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&(ch==')'||ch=='}'||ch==']')){
                char ch1=stack.pop();
                if(ch==')'&&ch1!='(') return false;
                else if(ch=='}'&&ch1!='{') return false;
                else if(ch==']'&&ch1!='[') return false;
            }else if((ch==')'||ch=='}'||ch==']')&&stack.isEmpty()){
                return false;
            }
            else if(ch=='('||ch=='{'||ch=='[')
              stack.push(ch);
            
        }
        return stack.isEmpty();
    }
}

