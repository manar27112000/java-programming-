package sorting;

public class insertion_sort {
    public void sort(int[] arr) {
        int key;
        int  j;
        for(int i=1; i<arr.length;i++){
            key = arr[i];
           j=i-1;
           while(j>=0 && arr[j]>key){
               arr[j+1] = arr[j];
               j--;

           }

        }

    }
}
