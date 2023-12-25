
public class Q10ReverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
         
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
         
          left++;
          right--;
        }
      }
        
      public static void main(String[] args) {
        int[] arr = {10,45,24,645,2,7,6};
        reverseArray(arr);
        for(int i : arr) {
          System.out.print(i+", ");
        }
      }
}
