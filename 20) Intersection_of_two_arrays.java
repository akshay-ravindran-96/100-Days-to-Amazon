class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0; i<nums1.length;i++)
        {
            if(!map.containsKey(nums1[i]))
            {
                map.put(nums1[i], 1);
            }
            
        }
        
        for(int i=0; i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                if(!map2.containsKey(nums2[i]))
                {
                    map2.put(nums2[i],1);
                    ans.add(nums2[i]);
                    
                }
            }
            
        }
        
 
        int result[] = new int[ans.size()];
        
        for(int i=0; i<ans.size();i++)
            result[i] =ans.get(i);
        
        return result;
    }
}
