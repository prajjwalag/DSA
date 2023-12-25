
public class Q06Count2 {
    public static void count2(int[] arr) {
        int count2 = 0;
        for(int i = 0; i<arr.length; i++) {
          if(arr[i]==2) {
            count2++;
          }
        }
        System.out.println("Count of 2s: " + count2);
      }
        
      public static void main(String[] args) {
        int[] arr = {1,4,2,5,2,6,4,2,7,5,2};
        count2(arr);
      }
}
