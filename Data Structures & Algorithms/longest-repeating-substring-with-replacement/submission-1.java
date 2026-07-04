class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxLen=0;
        int maxFreq=0;

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            hm.put(ch, hm.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,hm.get(ch));

            while((right-left)+1-maxFreq>k){
                char c=s.charAt(left);

                hm.put(c, hm.get(c)-1);
                if(hm.get(c)==0){
                    hm.remove(c);
                }
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
