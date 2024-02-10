import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - https://bit.ly/3WZoytT
// Strivers Link - https://takeuforward.org/pattern/pattern-10-half-diamond-star-pattern/

// The main method must be in a class named "Main"
class Solution02 {

    public static void solve(int n) {
        for(int i =0; i<=2*n-1; i++) {
            int stars = i;
            if(i>N) {
                stars = 2*N-i;
            }
            for(int j=0; j<stars; j++) {
                System.out.print(*);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(3);
    }
}
