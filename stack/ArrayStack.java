package stack;

/// A Simple Array-Based Stack Implementation
public  class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY=1000;
 private    E[] data;
 private int t=-1;
    public ArrayStack() { this(CAPACITY); }
    public ArrayStack(int capacity) {
        data = (E[ ]) new Object[capacity];
    }
    @Override
    public int size() {
        return (t+1);
    }

    @Override
    public boolean isEmpty() {

        return (t==-1)?true:false;
    }

    @Override
    public void push(E e) throws IllegalStateException{
        if(t==data.length){
            throw new IllegalStateException("Stack is full");
        }else{
            data[++t]=e;
        }


    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

  public static void main(String[] args) {
    ArrayStack<String> stack = new ArrayStack<String>();
    stack.push("A");
    stack.push("B");
    stack.push("C");
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.top());
    System.out.println(stack.pop());
    stack.push("D");
    System.out.println(stack.top());
  }
}





