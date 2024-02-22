package Striver.Step_03_Solve_Problems_On_Array.Step_03_1_Easy.Q02SecondLargestAndSmallestElement;

public class BetterApproach {
  public static int[] findSecondOrderElements(int[] arr) {
    int max = arr[0];
    int secondMax = Integer.MIN_VALUE;
    int min = arr[0];
    int secondMin = Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++ ) {
        if(max < arr[i]) {
            max = arr[i];
        }
        if(min >  arr[i]) {
            min = arr[i];
        }
    }
    for(int i=0; i < arr.length; i++) {
        if(secondMax < arr[i] && arr[i] < max)  {
            secondMax = arr[i];
        }
        if(secondMin > arr[i] && arr[i] > min)  {
            secondMin = arr[i];
        }
    }
    int[] result = {secondMax, secondMin};
    return result;
}
public static void main(String[] args) {
    int[] arr = {22, 31, 43, 45, 75, 12, 11, 98, 54, 35, 85, 87};
    int[] result = findSecondOrderElements(arr);
    System.out.println("Second Maximum Element: " + result[0]);
    System.out.println("Second Minimum Element: " + result[1]);
}
}
