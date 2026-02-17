//Binary Search using Iterative Method
import java.util.*;
class Binary1{
  static int bin(int arr[], int low, int high, int key) {
    low=0; high = arr.length-1;
    while(low<=high){
        int mid = (low + high) / 2;
        if (arr[mid] == key){
            return mid;
        }
        else if (arr[mid] < key){
            low = mid+1;
        }
        else{
            high= mid-1;
        }
    }
     return -1;
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
