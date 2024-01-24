public class Q21LeftRotateArray {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void leftRotateArray(int[] arr, int rotateElements) {
        rotateElements = rotateElements%arr.length;
        int[] temp = new int[arr.length];
        int rotationIndex = arr.length-rotateElements;
        for(int i=0; i<rotateElements; i++) {
            temp[i] = arr[i];
        }
        for(int i=0; i<rotationIndex; i++) {
            swap(arr, i, i+rotateElements);
        }
        for(int i=rotationIndex, j=0; i< arr.length; i++, j++) {
            arr[i] = temp[j];
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67};
        leftRotateArray(arr, 12);
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}