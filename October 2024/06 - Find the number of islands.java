class Solution {
    public void traverse(char[][] grid, int x, int y)
    {
        if(x>=grid.length || y>=grid[0].length || x<0 || y<0)return;
        if(grid[x][y]=='1')
        {
            grid[x][y]='0';
            traverse(grid, x+1, y);
            traverse(grid, x-1, y);
            traverse(grid, x, y+1);
            traverse(grid, x, y-1);
            traverse(grid, x-1, y-1);
            traverse(grid, x+1, y-1);
            traverse(grid, x-1, y+1);
            traverse(grid, x+1, y+1);
        }
    }
    public int numIslands(char[][] grid) {
        // Code here
        int result=0;
        for(int i=0; i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    result+=1;
                    traverse(grid, i, j);
                }
            }
        }
        return result;
    }
}

