//code for linear search in java
import java.util.*;
class linear{
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   //program will return the index if the target number is found
            }
        }
        return -1;  // program will return -1 if the target number is not found
    }
    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = x.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = x.nextInt();
        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
      x.close();
    }
}
    
