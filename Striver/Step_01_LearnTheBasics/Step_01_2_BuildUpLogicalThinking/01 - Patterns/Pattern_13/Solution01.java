import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3WWQ1wb
// Strivers Link - https://takeuforward.org/pattern/pattern-13-increasing-number-triangle-pattern/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        int count = 1;
        for(int i=0; i<n; i++) {
	        for(int j = 0; j<=i; j++, count++) {
	            System.out.print(count + " ");
	        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
