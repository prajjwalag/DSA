package ApnaCollege.S1ArraysPart1;

public class Q3BinarySearch {
    public static int binarySearch (int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        while(left<=right) {
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] < key) {
                left = mid+1;
            } 
            else if (arr[mid] > key) {
                right = mid-1;
            }
            mid = (left+right)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {01, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(binarySearch(arr, 01));
    }
}
