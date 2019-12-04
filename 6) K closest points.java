class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int [][] ans =  new int[k][2];
        int distances[] = new int[points.length];
        
        for (int i=0; i< points.length; i++)
        {
            distances[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];     
        }
        
        Arrays.sort(distances);
        int max = distances[k-1];
        
        System.out.println(max);
      int count =0;
            for(int j =0 ; j<distances.length; j++)
            {
                int temp = points[j][0] * points[j][0] + points[j][1] * points[j][1]; 
                if(temp <= max)
                {
                    ans[count][0] =points[j][0];
                    ans[count][1] = points[j][1];
                    count++;
                }
            }
            
        
        
        return ans;
        
        
    }
}
