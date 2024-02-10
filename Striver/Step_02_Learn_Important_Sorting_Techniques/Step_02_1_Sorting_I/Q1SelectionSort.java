package Striver.Step_02_Learn_Important_Sorting_Techniques.Step_02_1_Sorting_I;

    public class Q1SelectionSort{

        public static void selectionSort(int[] arr){
            for(int i=0; i<arr.length; i++) {
                int min_index = i;
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[j] < arr[min_index]) {
                        min_index = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {54, 34, 76, 23,78, 15, 89, 25};
            selectionSort(arr);
            for(int num: arr) {
                System.out.print(num + ", ");
            }
        }
    
    }
