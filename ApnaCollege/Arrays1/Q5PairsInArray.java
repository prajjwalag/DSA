package ApnaCollege.Arrays1;

public class Q5PairsInArray {
    public static void printPairs(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+1;  j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + "), ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56};
        printPairs(arr);
    }
}
