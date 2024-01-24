public class Q20Sort0and1 {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void sort0and1(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int i = 0;

        while(i<=right) {
            if(arr[i] == 0) {
                swap(arr, i, left);
                i++;
                left++;
            } else if(arr[i] == 1) {
                swap(arr, i, right);
                right--;
            }
        }
        for(int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0,0,0,1,1,1,1, 0};
        sort0and1(arr);
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}