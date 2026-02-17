//Binary Search using Recursive Method
import java.util.*;
class Binary1{
  static int bin(int arr[], int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return bin(arr, mid + 1, high, key);
        else
            return bin(arr, low, mid - 1, key);
    }
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int nums = sc.nextInt();
    System.out.println("Enter the elements: ");
    int []arr = new int[nums];
     for (int i = 0; i < nums; i++){
            arr[i] = sc.nextInt();
     }
    System.out.println("Enter element to search: ");
    int key = sc.nextInt();
    int result = bin(arr, 0, nums - 1, key);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
    
    
