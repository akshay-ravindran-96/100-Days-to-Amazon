class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> t = new HashMap<Character, Character>(); 
        t.put(')', '(');
        t.put('}', '{');
        t.put(']', '[');
        Stack<Character> ans = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
                if(!t.containsKey(c))
                    ans.push(c);
            if(t.containsKey(c))
            {
                char top = ans.isEmpty() ? '#' : ans.peek();
                if(top  != t.get(c))
                    return false;
                else
                    ans.pop();       
            }          
        }
             
        return (ans.isEmpty()); 
    }
}
