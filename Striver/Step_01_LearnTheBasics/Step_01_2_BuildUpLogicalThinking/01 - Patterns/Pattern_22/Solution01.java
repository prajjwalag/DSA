import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3vtRNJJ
// Strivers Link - https://takeuforward.org/pattern/pattern-22-the-number-pattern/


class Solution01 {
    
    public static void solve(int n) {
        int size = n*2-1;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j< size; j++) {
                int left = j;
                int top = i;
                int right = size-j-1;
                int bottom = size-i-1;

                int min = Math.min(Math.min(left, right), Math.min(top, bottom));
                int print = n-min;

                System.out.print(print);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
