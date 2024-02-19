package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q3RemoveDuplicates;

public class OptimalApproach {
    public static int removeDuplicates(int[] nums) {
        int countUnique = 1;
        for(int i=1; i < nums.length; i++) {
            if(nums[i-1] < nums[i]) {
                nums[countUnique] = nums[i];
                countUnique++;
            }

        }
        return countUnique;
    }

    public static void printArray(int[] arr, int size) {
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7};
        int size = removeDuplicates(arr);
        printArray(arr, size);
    }
}
