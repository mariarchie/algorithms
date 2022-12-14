public class HeapSort {
    public static void sort(int arr[]) {

        int length = arr.length;

        for (int i = length / 2 - 1; i >= 0; i--)
            heap(arr, length, i);

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heap(arr, i, 0);
        }
    }

    static void heap(int arr[], int length, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heap(arr, length, largest);
        }
    }

    static void printArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}