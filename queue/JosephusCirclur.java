package queue;

public class JosephusCirclur {
    public static<E> Object Josephus(CircularQueue<E>queue, int k){
      if(queue.isEmpty()) return null;
      while(queue.size()>1){
          for (int i = 0; i < k-1; i++) {
              queue.rotate();
               E e= (E) queue.dequeue();
          }
      }
        return queue.dequeue();
    }

//    public static<E>CircularQueue<E>buildQueue(E a[ ]){
//        CircularQueue<E>queue=new CircularQueue<>();
//         for(int i=0; i<a.length; i++)
//            queue.enqueue(a[i]);
//         return queue;
//         }
             public static void main(String[ ]args){
         String[ ]a1={"Alice","Bob","Cindy","Doug","Ed","Fred"};
         String[ ]a2={"Gene","Hope","Irene","Jack","Kim","Lance"};
         String[ ]a3={"Mike","Roberto"};
//         System.out.println("Firstwinneris"+Josephus(buildQueue(a1),3));
//         System.out.println("Secondwinneris"+Josephus(buildQueue(a2),10));
//         System.out.println("Thirdwinneris"+Josephus(buildQueue(a3),7));
         }
}
