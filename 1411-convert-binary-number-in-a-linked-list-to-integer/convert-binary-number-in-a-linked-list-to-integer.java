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
    public int getDecimalValue(ListNode head) {
        int pow = -1;
        ListNode temp = head;
        while(temp!=null){
            pow+=1;
            temp = temp.next;
        }

        int sum = 0;
        temp = head;
        while(temp!=null){
            int val = temp.val * (int)Math.pow(2, pow);
            sum = sum + val;
            pow -=1;
            temp = temp.next;
        }

        return sum;
    }
}