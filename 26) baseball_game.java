class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack();
    int res = 0;
        
        for(String str : ops) {
            if (str.equals("+")) {
                int top = s.pop();
                int newtop = top + s.peek();
                s.push(top);
                s.push(newtop);
            } else if (str.equals("C")) {
                s.pop();
            } else if (str.equals("D")) {
                s.push(2 * s.peek());
            } else {
                s.push(Integer.valueOf(str));
            }
        }

        
        for(int total : s) res +=total;
        return res;
    }
}
