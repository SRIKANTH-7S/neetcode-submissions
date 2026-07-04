// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int start=0;
        int end=rows*cols-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            int r=mid/cols;
            int c=mid%cols;
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
