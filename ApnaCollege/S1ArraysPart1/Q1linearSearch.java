package ApnaCollege.S1ArraysPart1;
public class Q1linearSearch {
    public static int search(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 42, 32, 54};
        System.out.println(search(arr, 25));
    }
}
