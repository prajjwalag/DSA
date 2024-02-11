package Striver.Step_02_Learn_Important_Sorting_Techniques.Step_02_1_Sorting_II;

public class Q2RecursiveBubbleSort {
    public static void bubbleSort(int[] arr, int n) {

        if( n == 0) {
            return;
        }
    
          for(int i = 0; i < n; i++ ) {
            if(arr[i] > arr[i+1]) { 
              int temp = arr[i];
              arr[i] = arr[i+1];
              arr[i+1] = temp;
            }
    
            bubbleSort(arr, n-1);
          }
        } 
        public static void main(String[] args) {
          int[] arr = {34, 22, 12, 64, 34, 65, 84, 33};
    
                          //0   //7
          bubbleSort(arr,  arr.length-1);
    
          for(int i= 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
          }
        }
}
