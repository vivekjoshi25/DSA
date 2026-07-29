/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}*/

class Solution {
    public Node merge(Node a , Node b){
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        Node result;
        if(a.data<=b.data){
            result=a;
            result.bottom= merge(a.bottom, b);
        }
        else{
            result=b;
            result.bottom=merge(a,b.bottom);
        }
        return result;
    }
    public Node flatten(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
            
        }
        head.next= flatten(head.next);
        head= merge(head, head.next);
        head.next = null;
        return head;
    }
}