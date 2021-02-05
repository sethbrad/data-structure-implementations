package sorts;

public abstract class AbstractSort {

    //TODO comment everything

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String toString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i : arr) {
            stringBuilder.append(i + " ");
        }
        return stringBuilder.toString();
    }
}
