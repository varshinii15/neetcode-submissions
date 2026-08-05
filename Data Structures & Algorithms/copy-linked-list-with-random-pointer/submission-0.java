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
    public Node copyRandomList(Node head) {
        
        Node temp=head;
        HashMap<Node,Node> h=new HashMap<>();

        while(temp!=null){
            h.put(temp,new Node(temp.val));
            temp=temp.next;
        }

        temp=head;

        while(temp!=null){
            h.get(temp).next=h.get(temp.next);
            h.get(temp).random=h.get(temp.random);
            temp=temp.next;
        }

        return h.get(head);
        

    }
}
