
//Practice Link - https://bit.ly/3QfK2k3
//Strivers Link - https://takeuforward.org/pattern/pattern-1-rectangular-star-pattern/
// The main method must be in a class named "Main"
class Solution01 {

    public static void solve(int size) {
        for(int i=0; i<size; i++) {
            for(int j =0; j<size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve(5);
    }
}
