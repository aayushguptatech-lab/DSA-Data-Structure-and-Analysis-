// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp = list1;
//         int size1 = 0;

//         while(temp != null) {
//             size1 += 1;
//             temp = temp.next;
//         }

//         temp = list2;
//         int size2 = 0;

//         while(temp != null) {
//             size2 += 1;
//             temp = temp.next;
//         }

//         if(size1 == 0) {
//             return list2;
//         }

//         if(size2 == 0) {
//             return list1;
//         }

//         int n = size1 + size2;
//         int[] arr = new int[n];

//         int i = 0;
//         ListNode temp1 = list1;
//         ListNode temp2 = list2;

//         while(i < n) {

//             // temp1 is finished
//             if(temp1 == null) {
//                 arr[i] = temp2.val;
//                 temp2 = temp2.next;
//                 i++;
//             }

//             // temp2 is finished
//             else if(temp2 == null) {
//                 arr[i] = temp1.val;
//                 temp1 = temp1.next;
//                 i++;
//             }

//             else if(temp1.val == temp2.val) {
//                 arr[i] = temp1.val;
//                 i++;

//                 arr[i] = temp2.val;
//                 i++;

//                 temp1 = temp1.next;
//                 temp2 = temp2.next;
//             }

//             else if(temp1.val < temp2.val) {
//                 arr[i] = temp1.val;
//                 temp1 = temp1.next;
//                 i++;
//             }

//             else {
//                 arr[i] = temp2.val;
//                 temp2 = temp2.next;
//                 i++;
//             }
//         }

//         temp1 = list1;
//         ListNode result = temp1;

//         int j = 0;

//         while(j < n) {

//             if(temp1 == null) {
//                 // We need to add remaining nodes
//                 break;
//             }

//             temp1.val = arr[j];
//             temp1 = temp1.next;
//             j++;
//         }

//         // If list1 doesn't have enough nodes,
//         // attach nodes from list2
//         if(j < n) {
//             temp1 = list1;

//             while(temp1.next != null) {
//                 temp1 = temp1.next;
//             }

//             ListNode temp2New = list2;

//             while(j < n) {
//                 ListNode newNode = new ListNode(arr[j]);
//                 temp1.next = newNode;
//                 temp1 = temp1.next;
//                 j++;
//             }
//         }

//         return result;
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        // Attach whichever list is remaining
        if(list1 != null) {
            temp.next = list1;
        }
        else {
            temp.next = list2;
        }

        return dummy.next;
    }
}