import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3vBpdpy
// Strivers Link - https://takeuforward.org/pattern/pattern-21-hollow-rectangle-pattern/


class Solution01 {
    
    public static void solve(int n) {
         for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j ==0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
