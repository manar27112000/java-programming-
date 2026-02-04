package linked_list;


class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Circularly_Linked_Lists {
    Node2 head;
    Node2 tail;

    public void addFirst(int data) {
        Node2 newNode = new Node2(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addLast(int data) {
        Node2 newNode = new Node2(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

    }

    public void deleteFirst() {
        if(head == null) {
            return;
        }else if(head == tail) {
            head = null;
            tail = null;
        }else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteLast() {
        if(head == null) {
            return;
        }else if(head == tail) {
            head = null;
            tail = null;
        }else {
            Node2 current = head;
            while(current.next != tail) {
                current = current.next;
            }
            current.next = head;
            tail = current;
        }
    }

    public void traverse() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        Node2 current = head;
        while (current.next != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);

    }

    public boolean search(int data) {

        if(head == null) {
            System.out.println("List is empty");
            return false;
        }

        Node2 current = head;
        while (current.next != head) {

            if(current.data == data) {
                System.out.println("yes");

                return true;

            }

            current = current.next;
        }

        return false;
    }

    /***************************************************/
    public void reverse() {

        if(head == null || head.next == head) {
            return;
        }
        Node2 current = head;
       while (current.next != head) {
           tail=head;
        head=tail.next;
           head.next=current.next;

       }



    }

    public void sort() {
        if(head == null|| head.next == head) {
            return;}
     for (int i = 0; i <size()-1 ; i++) {
         Node2 current = head;

         while (current.next != head){
             if (current.data > current.next.data) {
                 int temp = current.data;
                 current.data = current.next.data;
                 current.next.data = temp;
             }
             current = current.next;
         }
     }
    }

    public int size() {
        if(head == null) {
         //   System.out.println("List size is 0");
            return 0;
        }else {
             Node2 current = head;
            int count = 1;
            while(current.next != head) {count++;
                current = current.next;
            }
           // System.out.println("List size is " + count);
            return count;

        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public void isEmpty() {
        if (head == null) { System.out.println("List is empty");

        }
        else   System.out.println("List is not empty");
    }

    public void rotate() {
        if (head != null) {
            head = head.next;
            tail = tail.next;
        }
    }
}
