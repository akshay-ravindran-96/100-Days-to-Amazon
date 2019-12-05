class Solution {
    public int romanToInt(String s) {
        int[] map = new int[256];
        map['I'] = 1; map['V'] = 5; map['X'] = 10; map['L'] = 50; map['C'] = 100; map['D'] = 500; map['M'] = 1000;
        
        int ans = 0, prev = 1;
        for (int i = s.length()-1; i >= 0; --i) {
            int curr = map[s.charAt(i)];
            if (curr < prev) ans -= cur;
            else {
                prev = curr;
                ans += curr;
            }
        }
        return ans;
    }
