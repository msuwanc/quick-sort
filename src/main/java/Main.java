public class Main {
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};

        sort(a, 0, a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(a[j] < pivot) {
                i++;

                int tempValue = a[i];
                a[i] = a[j];
                a[j] = tempValue;
            }
        }

        int tempValue = a[i+1];
        a[i+1] = pivot;
        a[high] = tempValue;

        return i+1;
    }

    private static void sort(int[] a, int low, int high) {
        if(low < high) {
            int partitionIndex = partition(a, low, high);

            sort(a, low, partitionIndex-1);
            sort(a, partitionIndex+1, high);
        }
    }
}
