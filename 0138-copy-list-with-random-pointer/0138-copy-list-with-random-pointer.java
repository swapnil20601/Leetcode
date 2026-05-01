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
        Node curr = head;
        Node prev = null;
        Node newHead = null;

        while(curr != null){
            Node node = new Node(curr.val);
            if(newHead == null){
                newHead = node;
            }
            Node temp = curr.next;
            curr.next = node;
            node.next = temp;
            curr = temp;
        }

        curr = head;
        Node newCurr = newHead;

        while(curr != null){
            if(curr.random != null){
                newCurr.random = curr.random.next;
            }
            curr = curr.next.next;
            if(newCurr.next != null){
                newCurr = newCurr.next.next;
            }
        }

        curr = head;
        newCurr = newHead;

        while(curr != null && newCurr != null){
            curr.next = (newCurr != null) ? newCurr.next : null;
            curr = curr.next;
            newCurr.next = (curr != null) ? curr.next : null;
            newCurr = newCurr.next;
        }
        
        return newHead;
    }
}