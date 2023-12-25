import java.util.*;

// The main method must be in a class named "Main"
class Main {
    public static void printDivisors(int num) {
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i=1; i*i<=num; i++) {
        if(num%i==0) {
          arr.add(i);
          if(num/i != i) {
            arr.add(num/i);
          }
        }
      }
      Collections.sort(arr);
      for(int n : arr) {
        System.out.print(n + " ");
      }

    }
    public static void main(String[] args) {
        printDivisors(36);
    }
}
