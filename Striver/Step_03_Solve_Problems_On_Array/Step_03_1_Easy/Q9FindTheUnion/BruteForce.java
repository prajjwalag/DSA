package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q9FindTheUnion;

import java.util.Set;
import java.util.TreeSet;

public class BruteForce {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new TreeSet<>(); 
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        for(int i=0;  i< arr1Size; i++) {
            unionSet.add(arr1[i]);
        }
        for(int i=0; i < arr2Size; i++) {
            unionSet.add(arr2[i]);
        }
        int[] arr = new int[unionSet.size()];
        int it = 0;
        for(int num: unionSet) {
            arr[it++] = num;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 5, 6, 10};
        int[] arr2 = {1, 2, 2, 4, 5, 7, 8};

        int[] union = findUnion(arr1, arr2);

        printArray(union);
    }
}
