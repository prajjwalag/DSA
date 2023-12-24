import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3GyWCYs
// Strivers Link - https://takeuforward.org/pattern/pattern-14-increasing-letter-triangle-pattern/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=0; i<n; i++) {
            char print = 'A';
	        for(int j = 0; j<=i; j++, print++) {
                
	            System.out.print(print + " ");
	        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
