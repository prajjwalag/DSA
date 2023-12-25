
public class Q03LinearSearch {
        public static int linearSearch(int[] arr, int search) {
      
            for(int i=0; i<arr.length; i++) {
              if(arr[i] == search) {
                return i;
              }
            }
            return -1;
          }
            
          public static void main(String[] args) {
            int[] arr = {5, 10, 54, 32, 75};
            int index = linearSearch(arr, 98);
            System.out.println(index);
          }
}
