
public class Q12FindUniqueNoDuplicate {
    public static int[] union(int[] arr1, int[] arr2) {
        int[] unionArray = new int[arr1.length + arr2.length];
        for(int i =0; i < unionArray.length; i++) {
          if(i<arr1.length) {
            unionArray[i] = arr1[i];
          }
          else {
            unionArray[i] = arr2[i-arr1.length];
          }
        }
        return unionArray;
      }
        
      public static void main(String[] args) {
        int[] arr1 = {6,4,2,9,1};
        int[] arr2 = {3,5,0,7,8};
        int[] unionArray = union(arr1,arr2);
        for(int num: unionArray) {
          System.out.print(num + ", ");
        }
      }
}
