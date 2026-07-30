/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void insertInBetween(Node head){
         Node temp=head;
        while(temp!=null){
            Node newnode= new Node(temp.val);
            newnode.next=temp.next;
            temp.next= newnode;
            temp=temp.next.next;
        }

    }
    public void  randomPointer(Node head){
        Node temp=head;
        while(temp!=null){
            Node copynode= temp.next;
            if(temp.random!=null){
                copynode.random=temp.random.next;
            }
            else{
                copynode.random=null;
            }
            temp=temp.next.next;
        }
    }
    public Node nextpointer(Node head){
        Node dummynode =new Node(-1);
        Node res=dummynode;
        Node temp=head;
        while(temp!=null){
            res.next=temp.next;
           res=res.next;
           temp.next=temp.next.next;
           
           temp=temp.next;
        }
        return dummynode.next;
    }
    public Node copyRandomList(Node head) {
       if(head==null){
        return null;
       }
       insertInBetween(head);
       randomPointer(head);
       Node newhead=nextpointer(head);
        return newhead;
    }
}