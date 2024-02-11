package Striver.Step_02_Learn_Important_Sorting_Techniques.Step_02_1_Sorting_II;


// The main method must be in a class named "Main"
class Q4QuickSort {
    public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    public static int findPivotPosition(int[] arr, int low, int high) {
      int pivot = arr[low];
      int i = low;
      int j = high;
      while(i<j) {
        while(arr[i] <= pivot && i <= high-1) {
          i++;
        }
        while(arr[j] > pivot && j >= low-1) {
          j--;
        }
        if(i < j) {
          swap(arr, i, j);
        } 
      }
      swap(arr, low, j);
      return j;
    }

    public static void quicksort(int[] arr, int low, int high) {
      if(low < high) {
        int partition = findPivotPosition(arr, low, high);
        quicksort(arr, low, partition-1);
        quicksort(arr, partition+1, high);
      }
    }

    public static void printArray(int[] arr, int left, int right) {
      System.out.println("Array with index left = " + left + " and right = " + right);
      for(int i= left; i <= right; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println("\n");
    }
    public static void main(String[] args) {
        int[] arr = {34, 56, 43, 23, 12, 56, 76, 54, 98, 23};
        
        
        quicksort(arr, 0, arr.length-1);
        printArray(arr, 0, arr.length-1);

    }
}
