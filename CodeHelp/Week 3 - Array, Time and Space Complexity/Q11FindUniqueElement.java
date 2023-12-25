
public class Q11FindUniqueElement {
    public static int findUnique(int[] arr) {
        int xor = 1;
        for(int i=0; i<arr.length; i++) {
          xor = xor^arr[i];
        }
        return xor;
      }
        
      public static void main(String[] args) {
        int[] arr = {5,7,5,4,3,7,5,4};
        System.out.println(findUnique(arr));
      }
}
