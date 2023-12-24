import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3WXGSDD
// Strivers Link - https://takeuforward.org/pattern/pattern-5-inverted-right-pyramid/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=0; i<n; i++) {
            for(int j =n; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
