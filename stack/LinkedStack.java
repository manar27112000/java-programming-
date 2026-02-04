package stack;

import linked_list_with_clone.SinglyLinkedList;

public class LinkedStack<E extends Comparable<E>> implements Stack<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);   // top of stack = front of list
    }

    @Override
    public E pop() {
        return list.removeFirst();   // remove from front
    }

    @Override
    public E top() {
        return list.first();   // return front element
    }

    // Reverse using LinkedStack
    public static <E extends Comparable<E>> void reverse(E[] a) {
        LinkedStack<E> buffer = new LinkedStack<>();

        for (int i = 0; i < a.length; i++)
            buffer.push(a[i]);

        for (int i = 0; i < a.length; i++)
            a[i] = buffer.pop();
    }

    public static void main(String[] args) {

        // Test LinkedStack
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println(stack.top()); // d
        System.out.println(stack.pop()); // d
        System.out.println(stack.top()); // c
        System.out.println(stack.pop()); // c
        System.out.println(stack.top()); // b
        System.out.println(stack.pop()); // b
        System.out.println(stack.top()); // a
        System.out.println(stack.pop()); // a
        System.out.println(stack.isEmpty()); // true

        // Test reverse
        String[] arr = {"a", "b", "c", "d"};
        reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));
        // Output: [d, c, b, a]
    }
}
