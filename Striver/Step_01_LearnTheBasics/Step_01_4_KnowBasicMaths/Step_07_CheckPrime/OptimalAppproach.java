
// The main method must be in a class named "Main"
class Main {
    public static boolean checkPrime(int num) {
      for(int i=2; i*i<=num; i++) {
        if(num%i==0) {
          return false;
        }
      }
      return true;
    }
    public static void main(String[] args) {
        System.out.print(checkPrime(12));
    }
}
