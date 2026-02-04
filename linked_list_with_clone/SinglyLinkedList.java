package linked_list_with_clone;

public class SinglyLinkedList<E extends Comparable<E>> implements LinearList<E>, Cloneable {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }


    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, head);
        head = newNode;
        if (size == 0) tail = head;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) head = newNode;
        else tail.setNext(newNode);
        tail = newNode;

        size++;


    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E removedElement = head.getElement();
        head = head.getNext();
        size--;
        //if list is empty  (كان فيها عنصر واحد واتحذف)
        if (size == 0) tail = null;
        return removedElement;
    }

    @Override
    public E first() {
        return isEmpty() ? null : head.getElement();
    }

    @Override
    public E last() {

        return isEmpty() ? null : tail.getElement();

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;

    }

    @Override
    public void traverse() {

        Node<E> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }

    }

    @Override
    public boolean search(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.getElement().equals(e)) return true;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public E deleteLast() {
        if (isEmpty()) return null;
        E deletedElement = tail.getElement();
        Node<E> current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        current.setNext(null);
        tail = current;
        size--;
        return deletedElement;
    }

    @Override
    public void reverse() {

    }

    @Override
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node<E> current = head;
        while (current != null) {
            if (current.getElement().compareTo(current.getNext().getElement()) > 0) {
                E temp = current.getElement();
                current.setElement(current.getNext().getElement());
                current.getNext().setElement(temp);
                current = current.getNext();


            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SinglyLinkedList other = (SinglyLinkedList) o;
        if (size != other.size) return false;

        Node walkA = head;
        Node walkB = other.head;

        while (walkA != null) {
            if (!walkA.getElement().equals(walkB.getElement()))
                return false;
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }


    @Override
    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        SinglyLinkedList<E> list2 = (SinglyLinkedList<E>) super.clone();

        if (size > 0) {
            list2.head = new Node<>(head.getElement(), null);
            Node<E> list2current = head.getNext();
            Node<E> list2Tail = list2.head;
            while (list2current != null) {
                Node<E> newest = new Node<>(list2current.getElement(), null);
                list2Tail.setNext(newest);
                list2Tail = newest;
                list2current = list2current.getNext();
            }
            list2.tail = list2Tail;
        }
        return list2;
    }


    public void traverseFrom(int from) {
        if (from < 0 || from >= size) {
            System.out.println("Invalid index");
            return;
        }
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (index >= from) {
                System.out.print(current.getElement() + " ");
            }
            current = current.getNext();
            index++;

        }
        System.out.println();

    }

    public void insertAt(int index, E element) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }


    }


    public static void main(String[] args) throws CloneNotSupportedException {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        list1.addLast(50);

        System.out.print("Original list: ");
        list1.traverseFrom(1);
        System.out.println();

        SinglyLinkedList<Integer> list2 = list1.clone();

        System.out.print("Cloned list: ");
        list2.traverse();
        System.out.println();


        list1.addLast(40);

        System.out.println("After modifying original:");
        System.out.print("Original: ");
        list1.traverse();
        System.out.println();
        System.out.print("Clone: ");
        list2.traverse();
    }

}