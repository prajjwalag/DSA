
public class Q09ExtremePrint {
    public static void extremePrint(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
          if(left==right) {
            System.out.print(arr[left]);
          } else {
            System.out.print(arr[left] + ", " + arr[right] + ", ");
          }
          left++;
          right--;
        }
      }
        
      public static void main(String[] args) {
        int[] arr = {10,45,24,645,2,7,6,76};
        extremePrint(arr);
      }
}
