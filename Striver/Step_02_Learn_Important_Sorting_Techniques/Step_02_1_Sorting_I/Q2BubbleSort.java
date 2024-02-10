package Striver.Step_02_Learn_Important_Sorting_Techniques.Step_02_1_Sorting_I;

public class Q2BubbleSort {
    public static void swapArrayElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {    
                    swapArrayElements(arr, i, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {54, 34, 76, 23,78, 15, 89, 25};
        bubbleSort(arr);
        for(int num: arr) {
            System.out.print(num + ", ");
        }
    }
}
