
class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
        if(n==0)
            return ans;
        
        int r1=0, c1=0;
        int r2=n-1, c2=n-1;
        int i=1;
            while(r1<=r2 && c1<=c2)
            {
                
                for(int c=c1; c<=c2; c++)
                {
                    ans[r1][c]=i++;
                    
                    
                }
                
                for(int r=r1+1; r<=r2; r++)
                {
                    ans[r][c2]=i++;
                    
                }
                
                if(r1<=r2 && c1<=c2)
                {
                    for(int c =c2-1; c>c1; c--)
                        ans[r2][c]=i++;
                    
                    for(int r =r2; r>r1; r--)
                        ans[r][c1]=i++;       
                }
                r1++;
                r2--;
                c1++;
                c2--;
                
            }
          return ans;   
    }
}
