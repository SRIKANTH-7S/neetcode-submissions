class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            if(b>0){
                b--;
                a++;
            }
            else{
                a--;
                b++;
            }
        }
        return a;
    }
}
