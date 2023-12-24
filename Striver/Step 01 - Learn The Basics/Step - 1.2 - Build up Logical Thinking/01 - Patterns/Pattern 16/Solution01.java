import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3G9gq3g
// Strivers Link - https://takeuforward.org/pattern/pattern-16-alpha-ramp-pattern/


class Solution01 {
    
    public static void solve(int n) {
        char print = 'A';
        for(int i=0; i<n; i++, print++) {
            
	        for(int j = 0; j<=i; j++) {
                
	            System.out.print(print+" ");
	        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
