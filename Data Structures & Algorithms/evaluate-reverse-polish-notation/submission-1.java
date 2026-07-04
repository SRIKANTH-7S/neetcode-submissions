class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();

         for(String val : tokens){
            if(val.equals("+")){
                int a=st.pop();
                int b=st.pop();

                int res=a+b;
                st.push(res);
            }
            else if(val.equals("-")){
                int a=st.pop();
                int b=st.pop();

                int res=b-a;
                st.push(res);
            }
            else if(val.equals("*")){
                int a=st.pop();
                int b=st.pop();

                int res=a*b;
                st.push(res);
            }
            else if(val.equals("/")){
                int a=st.pop();
                int b=st.pop();

                int res=b/a;
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(val));
            }
         }
         return st.peek();
    }
}
