class Solution {
    public boolean isHappy(int n) {
         HashSet<Integer> hs=new HashSet<>();
     
         while(!hs.contains(n)){
            hs.add(n);
            
            n=fn(n);
         }
         if(n==1){
            return true;
        }
         return false;
    }
    public static int fn(int n){
        int res=0;

        while(n>0){
            int rem=n%10;
            res+=(rem*rem);
            n/=10;
        }

        return res;
    }
}
