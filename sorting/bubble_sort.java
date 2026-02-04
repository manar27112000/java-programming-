package sorting;

public class bubble_sort {
   public void sort(int[] arr){

       for (int i = 0; i < arr.length - 1; i++) {

           for (int j = 0; j < arr.length - 1 - i; j++) {
              if(arr[j+1]<arr[j]) {
                  int temp = arr[j+1];
                  arr[j+1] = arr[j ];
                  arr[j ] = temp;
              }

       }}
   }
}
