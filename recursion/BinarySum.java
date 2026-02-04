package recursion;

public class BinarySum {

    public static int binarySum(int[] arr, int low, int high) {
        if(low == high) {
            return arr[low];
        }else if(low > high) {
            return 0;
        }else {
            int mid = (low + high) / 2;
            return binarySum(arr, low, mid) + binarySum(arr, mid + 1, high);
        }
    }

    public static void main(String[] args) {

    }

}
