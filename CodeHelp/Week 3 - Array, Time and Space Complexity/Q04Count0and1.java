
public class Q04Count0and1 {
   public static void count0and1(int[] arr) {
      int count0 = 0;
      int count1 = 0;
      for(int i = 0; i<arr.length; i++) {
        if(arr[i]==0) {
          count0++;
        }
         else {
          count1++;
        }
      }
      System.out.println("Count of 0s: " + count0);
      System.out.println("Count of 1s: " + count1);
    }
      
    public static void main(String[] args) {
      int[] arr = {0,1,1,1,0,0,1,0,1,0};
      count0and1(arr);

    }
}
