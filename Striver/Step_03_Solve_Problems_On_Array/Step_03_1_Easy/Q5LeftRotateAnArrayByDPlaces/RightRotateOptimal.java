package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q5LeftRotateAnArrayByDPlaces;

public class RightRotateOptimal {
    public static void rightRotateArray(int[] arr, int k) {
        
        k = k % arr.length;
        
        reverseArray(arr, arr.length-k, arr.length-1);
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, 0, arr.length-1);
        
    }

    static void reverseArray(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
        rightRotateArray(arr, 3);
        printArray(arr);
    }
}
