package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q10FindMissingNumbers;

public class OptimalApproachUsingXOR {
    public static int findMissingNumber(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0; i < arr.length; i++) {
            xor1 = xor1^arr[i];
            xor2 = xor2^(i+1);
        }
        xor2 = xor2^arr.length+1;
        return (xor1^xor2);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(findMissingNumber(arr));
    }
}
