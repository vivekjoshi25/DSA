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
    public ListNode findLast(ListNode temp, int pos){
        int count=1;
        while(temp!=null){
            if(count==pos){
                return temp;
            }
            count++;
            temp=temp.next;

        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len+=1;
        }
        if(k==len){
            return head;
        }
        k=k%len;

        tail.next=head;
        ListNode last= findLast(head, len-k);
        ListNode newhead= last.next;
        last.next=null;

        return newhead;
    }
}