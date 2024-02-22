package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q05LeftRotateAnArrayByOnePlace;

public class Solution {
    public static void rotateLeftByOne(int[] arr) {
        int temp = arr[0];
        int n= arr.length;
        for(int i=0; i<n-1; i++) {
          arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
      }

      static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
      }
      public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateLeftByOne(arr);
        printArray(arr);
      }
}
