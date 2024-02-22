package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q01LargestElementInArray;

public class OptimalSolution {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++ ) {
          if(max < arr[i]) {
            max = arr[i];
          }
        }
        return max;
      }
  
      public static void main(String[] args) {
        int[] arr = {22, 31, 43, 45, 75, 12, 54, 35, 87};
  
        System.out.println("Maximum Element: " + findMax(arr));
      }
}
