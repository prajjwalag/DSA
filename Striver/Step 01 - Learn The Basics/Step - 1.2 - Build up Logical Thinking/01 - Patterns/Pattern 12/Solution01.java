import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3jDVVnD
// Strivers Link - https://takeuforward.org/pattern/pattern-12-number-crown-pattern/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        for(int i=1; i<=n; i++) {
	        for(int j = 1; j<=i; j++) {
	            System.out.print(j);
	        }
	        for(int k=0; k<(n-i)*2; k++) {
	            System.out.print(" ");
	        }
	        for(int l=i; l>0; l--) {
	            System.out.print(l);
	        }
	        System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
