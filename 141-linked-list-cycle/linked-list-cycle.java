/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode temp = head;

//         HashSet<ListNode> hs = new HashSet<>();
        
//         while(temp != null){
//             int val = temp.val;
//             if(hs.contains(temp)){
//                 return true;
//             }
//             hs.add(temp);
//             temp = temp.next;
//         }

//         return false;
        
//     }
// }

// this is the flouid warshall method
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
        
    }
}