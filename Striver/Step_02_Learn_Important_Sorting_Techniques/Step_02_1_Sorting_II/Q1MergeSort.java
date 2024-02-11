package Striver.Step_02_Learn_Important_Sorting_Techniques.Step_02_1_Sorting_II;

public class Q1MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        
        int left = low;   //3
        int right = mid+1;  //right = 4 and mid = 3 and mid+1 = 4
        int size = high-low+1; //size = 4-3+1 = 2
        int[] temp = new int[size]; //temp size == 2 
        int i = 0;  // i = 3
  
      
        //left = 3 mid = 3 right = 4 high = 4
        //left == mid right == high
        // true && true
        while(left <= mid && right <= high) {
          //arr[3] == 2 and arr[right] == 5  2 < 5 || true
          if(arr[left] <= arr[right]) {
            temp[i] = arr[left];
            left++; //3++ = 4
            i++;  //0
          } else {
            temp[i] = arr[right];
            right++;
            i++; 
          }
        }
        while(left <= mid) {
          temp[i] = arr[left];
            left++;
            i++;
        }
        while(right <= high) {
          temp[i] = arr[right];
          right++;
          i++;
        }
  
        for(int index = low; index <= high; index++) {
          arr[index] = temp[index-low];
        }
      }
  
      public static void mergeSort(int[] arr, int low, int high){
        if(low >= high) {
          return;
        }
        int mid = (low + high)/2;
        System.out.println("Came back to Merge Sort Function");
  
        System.out.println("Going Left");
        printArray(arr, low, mid);
        mergeSort(arr, low, mid);
  
  
        System.out.println("Going Right");
        printArray(arr, mid+1, high);
        mergeSort(arr, mid+1, high);
  
        System.out.println("Going To Merge");
        printArray(arr, low, high);
        merge(arr, low, mid, high);
  
        System.out.println("After Merging");
        printArray(arr, low, high);
      }
  
      public static void printArray(int[] arr, int left, int right) {
        System.out.println("Array with index left = " + left + " and right = " + right);
        for(int i= left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
      }
      public static void main(String[] args) {
          int[] arr = {3, 6, 4, 2, 5, 6, 4, 1, 3};
          
          printArray(arr, 0, arr.length-1);        
          mergeSort(arr, 0, arr.length-1);
          printArray(arr, 0, arr.length-1);
  
      }
}
