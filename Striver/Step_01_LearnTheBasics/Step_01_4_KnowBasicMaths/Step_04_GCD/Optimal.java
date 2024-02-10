
public class Optimal {
    public static int findGCD(int a, int b) {
        if(a==0) {
            return b;
        }

        return findGCD(b%a, a);
    }
    public static void main(String[] args) {
        System.out.print(findGCD(35, 28));
    }
}
