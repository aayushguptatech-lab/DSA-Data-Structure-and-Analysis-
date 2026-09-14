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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;

        HashSet<ListNode> hs = new HashSet<>();
        
        while(temp != null){
            int val = temp.val;
            if(hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp = temp.next;
        }

        return false;
        
    }
}