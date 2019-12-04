class Solution {
public int[] twoSum(int[] nums, int target) {
Map<Integer, Integer> map = new HashMap<>();

  for(int i=0; i< nums.length; i++)
  {
    int temp = target - nums[i];
    if(map.containsKey(temp))
    {
      int x[] = new int[2];
      x[1]= i;
      x[0]= map.get(temp);
      return x;
    }
    map.put(nums[i], i); 
  }

  return nums;
}
}
