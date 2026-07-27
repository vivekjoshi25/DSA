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

/**
 * Approach:
- Use three pointers: prev, curr, and next.
- Traverse the linked list from left to right.
- Store the next node before changing any links.
- Reverse the current node's pointer by making it point to the previous node.
- Move all pointers one step forward.
- Continue until all nodes are processed.
- The 'prev' pointer becomes the new head of the reversed list.

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea:
Reverse each link one by one while preserving the remaining list using the 'next' pointer.
 * Solution
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
     ListNode dummy= new ListNode(0);
     dummy.next=head;
     ListNode groupprev= dummy;
     while(true){
        ListNode kthnode= findkthNode(groupprev, k);
        if(kthnode==null){
            break;
        }
        ListNode groupnext= kthnode.next;
        ListNode curr= groupprev.next;
        
        ListNode prev= groupnext;
        while(curr!= groupnext){
            ListNode next= curr.next;
            curr.next=prev;
            prev= curr;
            curr=next;
        }
        ListNode temp= groupprev.next;
        groupprev.next= kthnode;
        groupprev= temp;
     }
     return dummy.next;
    }
    public ListNode findkthNode(ListNode curr, int k){
        while(curr!=null && k>0){
            curr=curr.next;
            k-=1;
        }
        return curr;
    }
}