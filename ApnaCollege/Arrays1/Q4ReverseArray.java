package ApnaCollege.Arrays1;

public class Q4ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 56, 67, 78, 89};
        reverseArray(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
