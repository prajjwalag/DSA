
public class Q05Count0and1Part2 {
    public static void count0and1(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i<arr.length; i++) {
          if(arr[i]==0) {
            count0++;
          } else if(arr[i]==1) {
            count1++;
          }
        }
        System.out.println("Count of 0s: " + count0);
        System.out.println("Count of 1s: " + count1);
      }
        
      public static void main(String[] args) {
        int[] arr = {0,5,3,2,7,1,7,0,5,1,3,5,0,1,6,1,0,1,0,5,1};
        count0and1(arr);
      }
}
