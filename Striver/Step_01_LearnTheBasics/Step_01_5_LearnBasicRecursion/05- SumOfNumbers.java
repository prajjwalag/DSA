import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
      public static int sumofNumbers(int num) {
        // Write your code here.
       if(num==1) {
        return 1;
       }
      return num+sumofNumbers(num-1);
    }
    public static void main(String[] args) {
        System.out.print(sumofNumbers(10));
    }
}
