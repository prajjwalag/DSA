

// The main method must be in a class named "Main"
class Main {
    public static void printDivisors(int num) {
       for(int i=1; i<=num; i++) {
          if(num%i==0) {
            System.out.print(i + " ");
          }
       }
    }
    public static void main(String[] args) {
        printDivisors(36);
    }
}
