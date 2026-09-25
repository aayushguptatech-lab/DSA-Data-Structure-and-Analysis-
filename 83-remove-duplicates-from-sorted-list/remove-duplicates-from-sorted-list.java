/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            int val = temp.val;
            while(temp.next!=null){
                if(val == temp.next.val){
                    temp.next = temp.next.next;
                }
                else{
                    break;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}