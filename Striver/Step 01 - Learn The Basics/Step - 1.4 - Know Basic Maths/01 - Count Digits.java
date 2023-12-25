import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - 
// Strivers Link - https://takeuforward.org/data-structure/count-digits-in-a-number/


class Solution01 {
    
    public static int countDigits(int n) {
        int val = (int) Math.log10(n)+1;
        return val;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(5654));
    }
}
