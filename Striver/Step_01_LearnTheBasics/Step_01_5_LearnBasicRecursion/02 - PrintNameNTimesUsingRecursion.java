import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
      public static void print(int count) {
        
        if(count==0) {
          return;
        }
        System.out.println("Hello World!");
        print(count-1);
      }
    public static void main(String[] args) {
        print(5);
    }
}
