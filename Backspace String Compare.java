class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = operation(s);
        t = operation(t);
        
        return s.equals(t);
    }
    
    String operation(String a)
    {
        Stack<Character> st = new Stack<>();
        
        int n = a.length();
        
        for(int i=0;i<n;i++)
        {
            char c = a.charAt(i);
            
            if(c=='#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder("");
        
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}
