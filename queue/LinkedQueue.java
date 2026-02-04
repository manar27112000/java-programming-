package queue;


import linked_list_with_clone.SinglyLinkedList;

public class LinkedQueue<E extends Comparable<E>> implements Queue<E>{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    @Override
    public int size() {
        return list.size() ;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E e) {
      list.addLast(e);
    }

    @Override
    public E dequeue() {
        return  list.removeFirst();
    }

    @Override
    public E first() {
        return  list.first();

    }
}
