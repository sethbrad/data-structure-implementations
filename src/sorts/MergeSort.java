package sorts;

public class MergeSort extends AbstractSort {

    public static int[] sort(int[] arr, int left, int right) {
        if (left < right) {
            //midpoint
            int mid = left + (right - left) / 2;

            //sort both halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            //merge
            merge(arr, left, mid, right);
        }
        return arr;
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int leftSize = m - l + 1;
        int rightSize = r - m;

        // temp arrays
        int[] left = new int[leftSize];
        int[] right = new int[leftSize];

        // copy elements into temps
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[m + j + 1];
        }

        // merge subarrays
        int i = 0, j = 0;
        int k = l;

        while (i < leftSize && j < rightSize) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining lessons
        while (i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        String out = toString(arr);

        System.out.println(out);
    }
}
