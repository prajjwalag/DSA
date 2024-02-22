package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q09FindTheUnion;

import java.util.ArrayList;
import java.util.List;

public class OptimalApproach {
     public static int[] findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        System.out.println(arr1Size + " " +arr2Size);
        int i=0;
        int j=0;
        while(i < arr1Size && j < arr2Size){
            System.out.println(i + " " + j);
            if(arr1[i] <= arr2[j]) {
                if( union.size()==0 || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if(arr2[j] < arr1[i]) {
                if( union.size()==0 || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < arr1Size) {
            if(union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while(j < arr2Size) {
            if(union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        int[] unionArr = new int[union.size()];
        int it = 0;
        for(int num : union) {
            unionArr[it++] = num;
        }
        return unionArr;
    }

    public static void printArray(int[] arr) {
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3};
        int[] arr2 = {2, 2, 4};

        int[] union = findUnion(arr1, arr2);

        printArray(union);
    }
}
