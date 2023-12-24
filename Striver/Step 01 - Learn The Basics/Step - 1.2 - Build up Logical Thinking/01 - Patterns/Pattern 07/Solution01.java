import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3GzvAAa
// Strivers Link - https://takeuforward.org/pattern/pattern-7-star-pyramid/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=0; i<n; i++) {
            for(int j = n; j>i+1; j--){
                System.out.print("  ");
            }
            for(int j = 0; j<i*2+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
