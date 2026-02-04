package recursion;

public class RecursiveSelectionSort {


    public static void sort(int[] arr) {

    sort(arr, 0, arr.length - 1);
    }


public static void sort(int[] arr, int low, int high) {
    if(low<high){
        int min = low;
        double minVal = arr[low];
        for (int i=low+1; i<=high; i++) {
            if(arr[i]<minVal) {
                min = i;
                minVal = arr[i];
            }
        }

        int temp = arr[low];
        arr[low] = arr[min];
        arr[min] = temp;
        sort(arr, low + 1, high);

    }
}
    public static void main(String[] args) {
        int [] arr = {3, 5, 2, 7, 1, 9, 8, 6, 4};

        sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print (arr[i]+" ");
        }

    }

}