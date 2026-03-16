public class Selection {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {

            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void printArray(int arr[]) {
        for(int i : arr)
            System.out.print(i + " ");
    }
    public static void main(String[] args) {
        int arr[] = {29, 10, 14, 37, 13};
      selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
