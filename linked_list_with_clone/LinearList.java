package linked_list_with_clone;

public interface LinearList<E> {
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E first();
    E last();
    int size();
    boolean isEmpty();
    void clear();
    void traverse();
    boolean search(E e);
    E deleteLast();
    void reverse();
    void sort();


}
