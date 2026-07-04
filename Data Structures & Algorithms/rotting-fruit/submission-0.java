class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q=new LinkedList<>();

        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        return BFS(grid,q,fresh);
    }
    public static int BFS(int[][] grid,Queue<int[]> q,int fresh){
        
        int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
        int min=0;

        while(!q.isEmpty() && fresh>0){
            int size=q.size();

            for(int i=0;i<size;i++){
                int[] curr=q.poll();

                int r=curr[0];
                int c=curr[1];

                for(int[] dir : directions){

                    int nr=r+dir[0];
                    int nc=c+dir[1];

                    if(nr<0||nc<0||nr>=grid.length||nc>=grid[0].length||grid[nr][nc]!=1){
                        continue;
                    }

                    grid[nr][nc]=2;

                    fresh--;
                    q.offer(new int[]{nr,nc});
                }
            }
            min++;
        }
        return fresh==0?min:-1;
    }
}
