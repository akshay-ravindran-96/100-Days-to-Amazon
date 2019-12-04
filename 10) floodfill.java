class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
      
        if(image[sr][sc] == newColor)
            return image;
        floodFillUtil(image, sr, sc, newColor,image[sr][sc]);
        
        
        return image;
        
    }
    
    public void floodFillUtil(int[][] image, int x, int y, int newColor, int color)
    {
          if(x < 0 || x >= image.length || y < 0 ||y >= image[0].length || image[x][y] != color)
        {
            return;
            
        }
        
        image[x][y] = newColor;

    floodFillUtil(image, x+1, y, newColor, color); 
    floodFillUtil(image, x-1, y, newColor, color); 
    floodFillUtil(image, x, y+1, newColor, color); 
    floodFillUtil(image, x, y-1, newColor, color); 
    
    }
}
