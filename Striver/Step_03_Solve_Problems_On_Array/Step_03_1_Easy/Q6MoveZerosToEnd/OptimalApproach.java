package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q6MoveZerosToEnd;

public class OptimalApproach {
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 0) {
                j=i;
                break;
            }
        }
        if(j==-1) {
            return;
        }
        for(int i=j+1; i< nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
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
