class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area=Math.max(area,DFS(grid,i,j));
                }
            }
        }
        return area;
    }
    public static int DFS(int[][] grid,int r,int c){
        if(r<0 ||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0){
            return 0;
        }

        grid[r][c]=0;
        int[][] directions={{0,1},{0,-1},{-1,0},{1,0}};

        int res=1;
        for(int[] dir : directions){
            int nr=r+dir[0];
            int nc=c+dir[1];

            res+=DFS(grid,nr,nc);
        }
        return res;
    }
}
