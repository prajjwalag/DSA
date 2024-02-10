import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3QfKij1
// Strivers Link - https://takeuforward.org/pattern/pattern-19-symmetric-void-pattern/


class Solution01 {
    
    public static void solve(int n) {
        for(int i=0; i<n; i++) {
            for(int j =0; j < (n-i); j++) {
                System.out.print("*");
            }
            for(int j =0; j < i*2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j < (n-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++) {
            for(int j =0; j <= i; j++) {
                System.out.print("*");
            }
            for(int j =0; j < (n-i-1)*2; j++) {
                System.out.print(" ");
            }
            for(int j =0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
