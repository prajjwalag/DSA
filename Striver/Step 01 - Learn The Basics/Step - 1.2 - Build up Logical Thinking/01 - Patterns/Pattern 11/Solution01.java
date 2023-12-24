import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3WLiUvW
// Strivers Link - https://takeuforward.org/pattern/pattern-11-binary-number-triangle-pattern/

// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int n) {
        int print = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if((i+j)%2==0) {
                    print = 1;
                } else {
                    print = 0;
                }
                System.out.print(print+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
