package ApnaCollege.S2ArraysPart2;

public class Q1MaxSubArraySumBruteForce {
    public static int maxSubArraySum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currentSum = 0;
                for(int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, -5, 4, 3,2,5,};
        System.out.println(maxSubArraySum(arr));
    }
}
