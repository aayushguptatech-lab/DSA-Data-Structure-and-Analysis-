class Solution {
    public boolean isBalanced(String num) {
        // 1)convert into character array
        int n = num.length();
        char[]arr = num.toCharArray();

        int Esum = 0;
        int Osum = 0;

        // 2)set the loop
        for(int i=0; i<n; i++){
            int digit = arr[i] - '0';
            //even
            if(i%2==0){
                Esum = Esum + digit;
            }
            //odd
            else{
                Osum = Osum + digit;
            }
        }

        System.out.println(Esum+" "+Osum);
        if(Esum == Osum) return true;
        else return false;
    }
}