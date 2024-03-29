package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q05LeftRotateAnArrayByOnePlace;

public class RotateRightByOne {
    public static void rotateRightByOne(int[] arr) {
        int n= arr.length;
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--) {
          arr[i] = arr[i-1];
        }
        arr[0] = temp;
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
    
        rotateRightByOne(arr);
        printArray(arr);
      }
}
