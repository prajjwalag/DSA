package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q08LinearSearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int search) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {23, 43, 21, 26, 78, 54};
        int index = linearSearch(arr, 54);
        System.out.println("Searched Element is present at index: " + index + " Element: " + arr[index]);
    }
}
