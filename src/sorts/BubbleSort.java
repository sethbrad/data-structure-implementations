package sorts;

public class BubbleSort extends AbstractSort {

    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j+1, arr);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        String out = toString(arr);

        System.out.println(out);
    }
}
