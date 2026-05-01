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
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        Node prev = null;
        Node newHead = null;

        while(curr != null){
            Node node = new Node(curr.val);
            if(newHead == null){
                newHead = node;
            }
            else{
                prev.next = node;
            }
            prev = node;
            map.put(curr, node);
            curr = curr.next;
        }

        curr = head;
        Node newCurr = newHead;

        while(curr != null){
            if(curr.random != null){
                newCurr.random = map.get(curr.random);
            }
            curr = curr.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
}