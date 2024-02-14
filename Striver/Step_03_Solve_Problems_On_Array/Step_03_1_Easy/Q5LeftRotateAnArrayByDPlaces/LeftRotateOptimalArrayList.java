package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q5LeftRotateAnArrayByDPlaces;

import java.util.ArrayList;

public class LeftRotateOptimalArrayList {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k = k%arr.size();
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.size()-1);
        reverseArray(arr, 0, arr.size()-1);
        return arr;
    }


    static void reverseArray(ArrayList<Integer> arr, int start, int end) {
        while(start <= end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    static void printArray(ArrayList<Integer> arr) {
        for(int i=0; i<arr.size(); i++) {
          System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        rotateArray(arr, 3);
        printArray(arr);
    }
}
