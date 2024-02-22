package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q10FindMissingNumbers;

public class OptimalApproach {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int totalSum = (n*(n+1))/2;
        System.out.println(totalSum);
        int sum = 0;
        for(int i=0; i < n; i++) {
            sum+=arr[i];
        }
        return totalSum - sum;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(findMissingNumber(arr));
    }
}
