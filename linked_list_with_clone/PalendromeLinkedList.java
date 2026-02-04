package linked_list_with_clone;

public class PalendromeLinkedList {

    public boolean isPalindrome(Node head) {

        Node current = head;
        Node reverse = null;

        while (current != null) {
            Node next = current.next;
            current.next = reverse;
            reverse = current;
            reverse = reverse.next;
        }

        while (head != null && reverse != null) {
            if (head.val == reverse.val) {
                return true;
            } else {
                return false;
            }

        }             return true;
    }
    public static void main(String[] args) {

    }

}

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }


}
