import java.util.*;
import java.lang.*;
import java.io.*;


// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int size) {
        for(int i=0; i<size; i++) {
            for(int j =0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
