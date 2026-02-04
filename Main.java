import linked_list.Circularly_Linked_Lists;
import linked_list.single_linked_list;
import linked_list_with_clone.CircularlyLinkedList;
import linked_list_with_clone.DoublyLinkedList;
import linked_list_with_clone.SinglyLinkedList;
import sorting.bubble_sort;
import sorting.insertion_sort;
import sorting.selection_sort;

import java.util.LinkedList;

public class Main {
//    public static void main(String[] args) {
//
//        /****Sorting****/
////        int arr[]={10,50,90,85,41,8,65,100};
////        selection_sort obj=new selection_sort();
////        bubble_sort obj1=new bubble_sort();
////        insertion_sort obj2=new insertion_sort();
////      //  obj.sort(arr);
////     //   obj1.sort(arr);
////       obj2.sort(arr);
////        System.out.println("Sorted array");
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////        }
//        /********Circular linked list********/
////        Circularly_Linked_Lists obj = new Circularly_Linked_Lists();
////        obj.addFirst(10);
////        obj.addFirst(50);
////        obj.addLast(30);
////        obj.addFirst(100);
////        obj.addFirst(70);
////        obj.traverse();
////        obj.rotate();
////        obj.deleteLast();
////        obj.traverse();
////        obj.isEmpty();
////       obj.clear();
////       obj.isEmpty();
////        obj.traverse();
////        obj.size();
////        obj.sort();
////        obj.traverse();
////        obj.search(50);
////        obj.reverse();
////        obj.traverse();
//
///**************single linked list******************/
////        single_linked_list obj = new single_linked_list();
////        obj.addFirst(10);
////        obj.addFirst(50);
////        obj.addLast(30);
////        obj.addFirst(100);
////        obj.addFirst(70);
////        obj.traverse();
////        obj.deleteLast();
////        obj.traverse();
////        obj.isEmpty();
////        obj.clear();
////        obj.isEmpty();
////        obj.traverse();
////        obj.size();
////        obj.sort();
////        obj.traverse();
////        obj.search(50);
////        obj.reverse();
////        obj.traverse();
///**************single linked list clone ******************/
////
////        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
////        list.addLast(4);
////        list.addLast(2);
////        list.addLast(9);
////        list.addLast(1);
////
////       // list.traverse();
////        list.deleteLast();
////        list.traverse();
////
////
/////to check if two linked list are equal or not
////        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
////        list1.addLast(1);
////        list1.addLast(2);
////        list1.addLast(3);
////
////        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
////        list2.addLast(1);
////        list2.addLast(2);
////        list2.addLast(3);
////
////        System.out.println(list1.equals(list2)); // ✅ true
//
//        /********Circular linked list clone ********/
////        CircularlyLinkedList list = new CircularlyLinkedList();
////        list.addFirst(4);
////        list.addFirst(2);
////        list.addLast(9);
////        list.addFirst(1);
////        list.traverse();
////        list.deleteLast();
////        list.traverse();
////
//
//        /********Doubly linked list clone ********/
//
////        DoublyLinkedList list = new DoublyLinkedList();
////        list.addFirst(4);
////        list.addFirst(2);
////        list.addLast(9);
////        list.addFirst(1);
////        list.traverse();
////        list.deleteLast();
////        list.traverse();
//
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);

        System.out.print("Original list: ");
        list1.traverse();
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
    LinkedList<String> l_list = new LinkedList<String>();

}
