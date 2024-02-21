package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q6LeftRotateAnArrayByDPlaces;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateBruteForceArrayList {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k = k % arr.size();
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<k; i++) {
            temp.add(arr.get(i));
        }
        for(int i=k; i<arr.size(); i++) {
            arr.set(i-k, arr.get(i));
        }
        for(int i=0; i<k; i++) {
            arr.set(arr.size()-k+i, temp.get(i));
        }
        return arr;
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
