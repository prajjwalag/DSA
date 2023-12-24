import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - 
// Strivers Link - https://takeuforward.org/pattern/pattern-18-alpha-triangle-pattern/


class Solution01 {
    
    public static void solve(int n) {
       char character = (char)('A' + (n-1));
        for(int i=0; i<n; i++, character--) {
            char print = character;
	        for(int j = 0; j<=i; j++, print++) {   
	            System.out.print(print+" ");
	        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
