package linked_list;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}



public class single_linked_list {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;


    }
    public void deleteFirst() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = null;



    }
    public void traverse() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public void search(int data) {

        Node current = head;
        while (current != null) {
            if(current.data == data) {
                System.out.println("Found");
                return;
            }
            current = current.next;
        }
    }
    public void reverse() {}
    public void sort() {
        if(head == null||head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            if(current.data>current.next.data) {
                int temp = current.data;
                current.data = current.next.data;
                current.next.data = temp;

            }
            current = current.next;

        }

    }
    public void size() {

        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }
    public void clear() {
        head=null;
    }
    public void isEmpty() {

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is not empty");
        }
    }


}
