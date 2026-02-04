package recursion;

public class RecursiveBinarySearch {

    public  int recursiveBinarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        return recursiveBinarySearch(arr, target, low, high);
    }

    public  int recursiveBinarySearch(int[] arr, int target,
                                            int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;}
        else if (arr[mid] > target) {
            return recursiveBinarySearch(arr, target, low, mid - 1);
        } else {
            return recursiveBinarySearch(arr, target, mid + 1, high);
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        RecursiveBinarySearch obj = new RecursiveBinarySearch();

        System.out.println("Index of target: " + obj.recursiveBinarySearch(arr, target));

    }
}
