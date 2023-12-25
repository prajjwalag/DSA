
public class Q18FindPairSum {
    public static int[] findPairSum (int[] arr, int sum) {
        int[] sol = {-1, -1};
        for(int i = 0; i<arr.length; i++) {
          for(int j = i+1; j < arr.length; j++) {
            if(arr[i] + arr[j] == sum) {
              sol[0] = arr[i];
              sol[1] = arr[j];
              break;
            }
          }
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{34,45,32,67,43,23};
        int[] sol = findPairSum(arr, 97);
        System.out.print(sol[0] + ", " + sol[1]);
    }
}
