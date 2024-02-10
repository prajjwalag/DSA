public class Armstrong {
    public static void checkArmstrong(int n) {
        int temp = n;
	    int countDigits = floor(log10(n) + 1);
	    int ans=0;

	    while(temp>0) {
		    int digit = temp%10;
		    ans = ans+pow(digit,countDigits); 
		    temp/=10;
	    }
	    if(ans == n) {
		    System.out.println(true);
	    }
	        System.out.println(false);
        }

    public static void main(String[] args) {
        checkArmstrong(1634);
    }
}