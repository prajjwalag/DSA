package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q7MoveZerosToEnd;

public class BruteForceApproach {
    public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                temp[j] = nums[i];
                j++;
            }
        }
        for(int i=0; i<j; i++) {
            nums[i] = temp[i];
        }
        for(int i=j; i< nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 0, 4, 3,2, 0, 0, 0, 1};
        moveZeroes(arr);
        printArray(arr);
    }
}
