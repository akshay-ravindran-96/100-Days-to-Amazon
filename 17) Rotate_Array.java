class Solution {
    
    
    public void rotate(int[] nums, int k) {
        
         k = k% nums.length;
        if( k==0)
            return;
        
       int  end= nums.length-1;
    for (int i =0; i<= end ;i++)
     {
         int temp =nums[end];
         nums[end] = nums[i];
         nums[i] = temp;
         end--;
     }
        // return;
        end =k-1;
        int i=0;
     while (i<end)
     {
         int temp =nums[end];
         nums[end] = nums[i];
         nums[i] = temp;
         System.out.println(nums[i] +""+ nums[end]);
         end--;
         i++;
            
     }
       
        end= nums.length-1;
     for( i=k; i<=end;i++)
     {
         int temp = nums[end];
         nums[end]= nums[i];
         nums[i] = temp;
         end--;
         
     }
       
        
return;
        
        
        
    }
}
