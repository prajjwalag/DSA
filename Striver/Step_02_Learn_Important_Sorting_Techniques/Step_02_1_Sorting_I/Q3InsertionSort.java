package Striver.Step_02_Learn_Important_Sorting_Techniques.Step_02_1_Sorting_I;


public class Q3InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int element = arr[i];
            int j=i-1;
            for(; j>=0 && arr[j] > element; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = element;
        }
    }
    public static void main(String[] args) {
        int[] arr = {54, 34, 76, 23,78, 15, 89, 25};
        insertionSort(arr);
        for(int num: arr) {
            System.out.print(num + ", ");
        }
    }
}
