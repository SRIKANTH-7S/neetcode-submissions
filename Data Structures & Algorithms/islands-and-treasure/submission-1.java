class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        BFS(grid,q);
    }
    public static void BFS(int[][] grid,Queue<int[]> q){
        
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};

        while(!q.isEmpty()){
            int[] curr=q.poll();

            int r=curr[0];
            int c=curr[1];

            for(int[] dir : directions){
                int nr=r+dir[0];
                int nc=c+dir[1];

                if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc] != Integer.MAX_VALUE){
                    continue;
                }

                grid[nr][nc]=grid[r][c]+1;

                q.offer(new int[]{nr,nc});
            }
        }
    }
}
