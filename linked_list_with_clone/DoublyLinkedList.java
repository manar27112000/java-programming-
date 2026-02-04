package linked_list_with_clone;

public class DoublyLinkedList<E> implements LinearList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            this.element = e;
            this.prev = p;
            this.next = n;
        }


        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList() {
    header = new Node<>(null, null, null);
    trailer = new Node<>(null, header, null);
    header.setNext(trailer);
}
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();  // اللي قبلها
        Node<E> successor = node.getNext();    // اللي بعدها

        predecessor.setNext(successor);        // اربط اللي قبل باللي بعد
        successor.setPrev(predecessor);        // والعكس
        size--;                                // قلل الحجم
        return node.getElement();              // رجّع العنصر اللي اتشال
    }

    @Override
    public E first() {
        return header.getNext().getElement();
    }

    @Override
    public E last() {
        return trailer.getPrev().getElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
  header.setNext(trailer);
  trailer.setPrev(header);
  size = 0;

    }


    @Override
    public void addFirst(E e) {
        addBetween(e,header,header.getNext());

    }

    @Override
    public void addLast(E e) {
        addBetween(e,trailer.getPrev(),trailer);

    }
    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
      return   remove(header.getNext());

    }
    @Override
    public void traverse() {
        if(isEmpty()) {
            return;
        }

        Node<E> current = header.getNext();
        while (current != trailer) {
            System.out.println(current.getElement()+" ");
            current = current.getNext();
        }

    }

    @Override
    public boolean search(E e) {
       if (isEmpty()) {
           return false;
       }
       Node<E> current = header.getNext();
       while (current != trailer) {
           if (current.getElement().equals(e)) {
               return true;
           }
           current = current.getNext();
       }
       return false;
    }

    @Override
    public E deleteLast() {
        return remove(trailer.getPrev());
    }

    @Override
    public void reverse() {

    }

    @Override
    public void sort() {

    }
}
