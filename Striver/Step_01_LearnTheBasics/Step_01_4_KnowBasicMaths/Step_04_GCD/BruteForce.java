

// Practice Link - 
// Strivers Link - https://takeuforward.org/c-programs/reverse-a-number-in-c/

class BruteForce {
    
    public static int findGCD(int a, int b) {
        int min = Math.min(a, b);
        for(int i=min; i>=1; i--) {
            if(a%i == 0 && b%i ==0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(76, 42));
    }
}
