// class Solution {
//     public int scoreOfParentheses(String s) {
//         Stack<Character> st = new Stack<>();
//         int count = 0;
//         int ans = 0;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i) == '('){
//                 st.push('(');
//                 count += 1;
//             }else{
//                 st.pop();
//                 if(st.isEmpty() == true){
//                     int sum = 0;
//                     for(int j=1; j<=count; j++){
//                         if(j==1){
//                             sum = 1;
//                         }else{
//                             sum = sum * 2;
//                         }
//                     }
//                     ans += sum;
//                     sum = 0;
//                 }
//             }
//         }
//         return ans;
//     }
// }



class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push('(');
                count += 1;
            }else{
                st.pop();
                count -= 1;

                if(s.charAt(i-1) == '('){
                    int sum = 1;

                    for(int j=1; j<=count; j++){
                        sum = sum * 2;
                    }

                    ans += sum;
                    sum = 0;
                }
            }
        }
        return ans;
    }
}