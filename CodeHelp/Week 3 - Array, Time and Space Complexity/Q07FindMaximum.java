public class Q07FindMaximum {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
          if(arr[i]>max) {
            max = arr[i];
          }
        }
        return max;
      }
        
      public static void main(String[] args) {
        int[] arr = {10,45,24,645,2,7,6};
        System.out.print(findMax(arr));
      }
}