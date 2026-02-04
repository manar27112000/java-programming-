package linked_list_with_clone;

public class CircularlyLinkedList<E> implements LinearList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {
    }

    @Override
    public void addFirst(E e) {
        if (tail == null) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
            }
        size++;
    }


    @Override
    public void addLast(E e) {
        if (tail == null) {
            tail = new Node<>(e, null);
            tail.setNext(tail);

        }else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;

        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }

        size--;
        return head.getElement();
    }


    @Override
    public E first() {
        return tail.getNext().getElement();
    }

    @Override
    public E last() {
        return tail.getElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
        tail = null;
        size = 0;

    }

    @Override
    public void traverse() {
        Node<E> current = tail.getNext();
        while (current != tail) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println(current.getElement());

    }

    @Override
    public boolean search(E e) {
        if (isEmpty()) return false;
        Node<E> current = tail.getNext();
        while (current != tail) {
            if (current.getElement().equals(e)) {
                return true;
        }
        current = current.getNext();}

        return false;
    }

    @Override
    public E deleteLast() {
       if(isEmpty()) return null;

       Node<E> head = tail.getNext();
       E element = tail.getElement();

       if(head == tail) {
           tail = null;
       } else {
           Node<E> current = tail.getNext();
           while(current.getNext() != tail) {
               current = current.getNext();
           }

           current.setNext(tail.getNext());
           tail = current;
       }
       size--;
       return element;
    }

    @Override
    public void reverse() {

    }

    @Override
    public void sort() {

    }

    public void rotate() {
        if (tail != null)
        tail = tail.getNext();
    }




}
