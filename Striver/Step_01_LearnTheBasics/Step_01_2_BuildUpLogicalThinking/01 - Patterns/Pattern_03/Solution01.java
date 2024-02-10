import java.util.*;
import java.lang.*;
import java.io.*;


// Practice Link - https://bit.ly/3CiWV74
// Strivers Link - https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=1; i<=n; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
