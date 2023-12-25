
public class Q19FindTripletSum {
    public static int[] findTripletSum (int[] arr, int sum) {
        int[] sol = {-1, -1, -1};
        for(int i = 0; i<arr.length; i++) {
          for(int j = i+1; j < arr.length; j++) {
            for(int k = j+1; k < arr.length; k++) {
              if(arr[i] + arr[j] + arr[k] == sum) {
              sol[0] = arr[i];
              sol[1] = arr[j];
              sol[2] = arr[k];
              break;
            }
            }
            
          }
        }
        return sol;
      }
      public static void main(String[] args) {
        int[] arr = new int[]{34,45,32,67,43,23};
        int[] sol = findTripletSum(arr, 133);
        System.out.print(sol[0] + ", " + sol[1] + ", " + sol[2]);
      }
}
