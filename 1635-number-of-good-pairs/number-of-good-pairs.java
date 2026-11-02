// TC:- O(n*2):- Not an optimized approach
// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     count += 1;
//                 }
//             }
//         }
//         return count;
//     }
// }


// now we have to optimized its approach
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++){
            count += freq[nums[i]];
            freq[nums[i]]++;
        }
        return count;
    }
}