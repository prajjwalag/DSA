import java.util.*;
import java.lang.*;
import java.io.*;


// Practice Link - https://bit.ly/3QfK2k3
// Strivers Link - https://takeuforward.org/pattern/pattern-2-right-angled-triangle-pattern/

class Solution01 {

    public static void solve(int size) {
        for(int i=0; i<size; i++) {
            for(int j =0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
