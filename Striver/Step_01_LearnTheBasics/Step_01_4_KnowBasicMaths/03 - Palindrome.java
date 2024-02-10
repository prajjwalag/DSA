import java.util.*;
import java.lang.*;
import java.io.*;

// Practice Link - 
// Strivers Link - https://takeuforward.org/c-programs/reverse-a-number-in-c/

class Main {
    
    public static int reverse(int n) {
        int temp = n;
        int revesedNum = 0;
        while(temp>0) {
            int num = temp%10;
            revesedNum = revesedNum*10 + num;
            temp/=10;
        }
        return revesedNum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(76653));
    }
}
