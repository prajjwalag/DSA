package ApnaCollege.S1ArraysPart1;

public class Q2largestinArray {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    } 

    public static void main(String[] args) {
        int[] arr = {34, 23, 56, 21, 22, 57, 89};
        System.out.println(findMax(arr));
    }
}
