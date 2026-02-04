package linked_list_with_clone;



  class NodeList {
    int val;
    NodeList next;
    NodeList(){}
    NodeList(int val){
        this.val = val;
    }
     NodeList(int val, NodeList next) {
        this.val = val;
        this.next = next;
    }

}

public class AddTwoNumbersInLinkedList {
      public NodeList addTwoNumbers(NodeList l1, NodeList l2) {

        if(l1 == null && l2 == null)
            return null;

        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        NodeList head = new NodeList();
        NodeList current = head;

        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {

            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) ;
            if(sum>9){
                sum=sum-10;
            }

//            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
//            carry = sum / 10;
//            current.next = new NodeList(sum % 10);
//            current = current.next;

        }

        return null;
      }


}
