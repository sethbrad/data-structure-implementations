package sorts;

public class QuickSort extends AbstractSort {

    public static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // sort on either side of partition
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
        return arr;
    }

    // picks a pivot so that all behind are less than and all ahead are greater than
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            //compare pivot
            if (arr[j] < pivot) {
                i++;
                swap(i, j, arr);
            }
        }
        swap(i + 1, high, arr);

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        String out = toString(arr);

        System.out.println(out);
    }
}
