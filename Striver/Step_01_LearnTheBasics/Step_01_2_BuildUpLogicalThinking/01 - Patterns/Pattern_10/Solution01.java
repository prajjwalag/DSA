import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3WZoytT
// Strivers Link - https://takeuforward.org/pattern/pattern-10-half-diamond-star-pattern/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=0; i<size-1; i++) {
            for(int j =0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++) {
            for(int j =n; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
