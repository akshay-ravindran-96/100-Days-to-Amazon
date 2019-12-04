class KthLargest {
    
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

    int K=0;
    public KthLargest(int k, int[] nums) {
        K=k;
        for(int i=0; i<nums.length;i++)
        {
            q.add(nums[i]);
        }
        
    }
    
    public int add(int val) {
        q.add(val);
        
        while(q.size() > K)
            q.poll();
            
        return q.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
