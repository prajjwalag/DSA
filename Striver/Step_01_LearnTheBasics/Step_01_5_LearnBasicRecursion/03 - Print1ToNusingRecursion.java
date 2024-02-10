import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
      public static void print(int count) {
        
        if(count==0) {
          return;
        }
        print(count-1);
        System.out.print(count + " ");
      }
    public static void main(String[] args) {
        print(5);
    }
}
