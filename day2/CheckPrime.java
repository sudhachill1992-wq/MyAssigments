package week1.day2;

public class CheckPrime {
	
	public static void main(String[] args) {
        int n = 17; 
        int i;


        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break; 
            }
        }

        if (i == n && n > 1) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

}
