import java.util.Date;

class Main {
    public static void main(String args[]) {
        for (int i = 100000; i <= 100000; i += 100000) {
            int[] arr1 = new int[i];
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = (int) (Math.random() * 100000);
            }
            int[] arr2 = new int[arr1.length];
            for (int k = 0; k < arr1.length; k++) {
                arr2[k] = arr1[k];
            }
            int[] arr3 = new int[arr1.length];
            for (int l = 0; l < arr1.length; l++) {
                arr3[l] = arr1[l];
            }

            Date HeapStartDate = new Date();
            HeapSort.sort(arr1);
            Date HeapEndDate = new Date();
            long HeapSortDuration = HeapEndDate.getTime() - HeapStartDate.getTime();

            Date QuickStartDate = new Date();
            QuickSort.sort(arr2);
            Date QuickEndDate = new Date();
            long QuickSortDuration = QuickEndDate.getTime() - QuickStartDate.getTime();

            Date MergeStartDate = new Date();
            MergeSort.sort(arr3);
            Date MergeEndDate = new Date();
            long MergeSortDuration = MergeEndDate.getTime() - MergeStartDate.getTime();

            System.out.print("HeapSort: ");
            PrintArray.printArray(arr1);
            
            System.out.printf("HeapSort duration: %s, QuickSort duration: %s, MergeSort duration: %s%n",
                    HeapSortDuration, QuickSortDuration, MergeSortDuration);
        }
    }
}
