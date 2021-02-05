package sorts;

public class QuickSort extends AbstractSort {

    public static int[] sort(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        String out = toString(arr);

        System.out.println(out);
    }
}
