import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3jJ7CcR
// Strivers Link - https://takeuforward.org/pattern/pattern-17-alpha-hill-pattern/


class Solution01 {
    
    public static void solve(int n) {
        for(int i=0; i<n; i++) {
            char print = 'A';
            for(int j=1; j < (n-i); j++){
                System.out.print("  ");
            }
	        for(int j = 0; j<=i; j++, print++) {   
	            System.out.print(print+" ");
	        }
            print-=2;
            for(int j = 0; j < i; j++, print--) {
                System.out.print(print+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
