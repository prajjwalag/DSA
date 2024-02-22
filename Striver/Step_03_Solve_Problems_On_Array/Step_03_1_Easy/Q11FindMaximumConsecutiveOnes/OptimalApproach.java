package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q11FindMaximumConsecutiveOnes;

public class OptimalApproach {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOneCount = 0;
        int OneCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1) {
                if(maxOneCount < OneCount) {
                    maxOneCount = OneCount;
                }
                OneCount = 0;
            } else if(nums[i] == 1) {
                OneCount++;
            }
        }
        if(maxOneCount < OneCount) {
                    maxOneCount = OneCount;
        }
        return maxOneCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.print(findMaxConsecutiveOnes(arr));
    }

}
