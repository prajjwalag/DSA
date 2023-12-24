import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3i06XDu
// Strivers Link - https://takeuforward.org/pattern/pattern-6-inverted-numbered-right-pyramid/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=0; i<n; i++) {
            for(int j =n; j>i; j--) {
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
