/*
Har character ko push karo.
Check karo ki stack ke top 3 elements abc hain ya nahi.
Agar abc hain → teeno ko pop kar do.
Agar abc nahi hain → unhe stack mein rehne do.
End mein stack empty hai toh true, otherwise false.
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            st.push(ch);
            if(st.size() >= 3){
                char c = st.pop();
                char b = st.pop();
                char a = st.pop();

                if(a == 'a' && b == 'b' && c == 'c'){
                    //remove it
                }else{
                    st.push(a);
                    st.push(b);
                    st.push(c);
                }
            }
        }
        if(st.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}