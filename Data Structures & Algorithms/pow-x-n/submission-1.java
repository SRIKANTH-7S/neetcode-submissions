// class Solution {
//     public double myPow(double x, int n) {
//         double res=1;
//         if(n<0){
//             n=-n;
//             for(int i=1;i<=n;i++){
//             res*=x;
//             }
//             return 1/res;
//         }
//         for(int i=1;i<=n;i++){
//             res*=x;
//         }
//         return res;
//     }
// }


class Solution {
    public double myPow(double x, int n) {
        double res=1;

        boolean negative=n<0;
        
        if(negative){
            n=-n;
        }
        for(int i=1;i<=n;i++){
            res*=x;
        }
        if(negative){
            return 1/res;
        }
        return res;
    }
}
