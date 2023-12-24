import java.util.*;
import java.lang.*;
import java.io.*;


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
