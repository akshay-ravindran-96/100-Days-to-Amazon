class Solution {
    public int findPairs(int[] nums, int k) {
        
        if (k < 0) return 0;
        Set<Integer> number = new HashSet<>();
        Set<Integer> present = new HashSet<>();
      
        for (int n : nums) {
            if (number.contains(n + k)) present.add(n);
            if (number.contains(n - k)) present.add(n - k);
            number.add(n);
        }
      
        return present.size();     
   }
}
