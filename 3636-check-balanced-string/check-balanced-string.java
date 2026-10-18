// since this is optimized code --> TC = O(n) + SC = O(n)

// class Solution {
//     public boolean isBalanced(String num) {
//         // 1)convert into character array
//         int n = num.length();
//         char[]arr = num.toCharArray();

//         int Esum = 0;
//         int Osum = 0;

//         // 2)set the loop
//         for(int i=0; i<n; i++){
//             int digit = arr[i] - '0';
//             //even
//             if(i%2==0){
//                 Esum = Esum + digit;
//             }
//             //odd
//             else{
//                 Osum = Osum + digit;
//             }
//         }

//         System.out.println(Esum+" "+Osum);
//         if(Esum == Osum) return true;
//         else return false;
//     }
// }

// we can make this code more optimized --> TC O(n) + SC O(1)
class Solution {
    public boolean isBalanced(String num) {
        int Esum = 0;
        int Osum = 0;
        
        for(int i=0; i<num.length(); i++){
            int digit = num.charAt(i) - '0';
            if(i%2 == 0) Esum = Esum + digit;
            else Osum = Osum + digit;
        }
        
        if(Esum == Osum) return true;
        else return false;
    }
}