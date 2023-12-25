import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
      public static int factorial(int num) {
        if(num<=1) {
          return 1;
        }
        return num*factorial(num-1);
      }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
