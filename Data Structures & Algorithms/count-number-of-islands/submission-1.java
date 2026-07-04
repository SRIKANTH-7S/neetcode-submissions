// class Solution {
//     public int numIslands(char[][] grid) {
//         int count=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]=='1'){
//                     BFS(grid,i,j);
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void BFS(char[][] grid,int r,int c){
//         Queue<int[]> q=new LinkedList<>();

//         grid[r][c]='0';
//         q.add(new int[]{r,c});

//         while(!q.isEmpty()){
//             int[] node=q.poll();

//             int row=node[0];
//             int col=node[1];

//             int[][] directions={{0,1},{0,-1},{-1,0},{1,0}};

//             for(int[] dir : directions){
//                 int nr=row+dir[0];
//                 int nc=col+dir[1];

//                 if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1'){
//                     q.add(new int[]{nr,nc});
//                     grid[nr][nc]='0';
//                 }
//             }
//         }
//     } 
// }

class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void DFS(char[][] grid,int r,int c){

        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
         if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] == '0'){
            return;
         }

         grid[r][c]='0';
         for(int[] dir : directions){
            DFS(grid, r+dir[0], c+dir[1]);
         }
    } 
}
