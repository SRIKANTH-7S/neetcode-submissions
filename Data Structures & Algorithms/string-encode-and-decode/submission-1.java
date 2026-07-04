class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();

        for(String s: strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        int left=0;
        int right=0;
        ArrayList<String> res=new ArrayList<>();

        while(right<str.length()){
        
            while(str.charAt(right)!='#'){
                right++;
            }
            int len=Integer.parseInt(str.substring(left,right));

            String word=str.substring(right+1,right+len+1);
            res.add(word);

            left=right+len+1;
            right=right+len+1;
        }
        return res;
    }
}
