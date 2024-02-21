package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q6LeftRotateAnArrayByDPlaces;

public class LeftRotateBruteForce {
    public static void leftRotateArray(int[] arr, int d) {
        d = d%arr.length;
        int[] temp = new int[d];
        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }
        for(int i=d; i<arr.length; i++) {
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++) {
            arr[arr.length-d+i] = temp[i];
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
        leftRotateArray(arr, 3);
        printArray(arr);
    }
}
