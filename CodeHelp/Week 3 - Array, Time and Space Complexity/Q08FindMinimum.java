
public class Q08FindMinimum {
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++) {
          if(arr[i]<min) {
            min = arr[i];
          }
        }
        return min;
      }
        
      public static void main(String[] args) {
        int[] arr = {10,45,24,645,2,7,6};
        System.out.print(findMin(arr));
      }
}
