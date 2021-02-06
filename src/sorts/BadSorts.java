package sorts;

public class BadSorts extends AbstractSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j+1, arr);
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex, arr);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        int[] arr2 = {5,4,3,2,1};
        int[] arr3 = {5,4,3,2,1};

        bubbleSort(arr1);
        selectionSort(arr2);
        insertionSort(arr3);

        String out1 = toString(arr1);
        String out2 = toString(arr2);
        String out3 = toString(arr3);

        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);

    }
}
