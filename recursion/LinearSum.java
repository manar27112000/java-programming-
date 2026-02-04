package recursion;

public class LinearSum {

    public static int linearSum(int[] arr, int n) {

        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + linearSum(arr, n - 1);
    }
    public static void main(String[] args) {}
}
