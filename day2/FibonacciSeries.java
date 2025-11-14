package week1.day2;

public class FibonacciSeries {
	

	    public static void main(String[] args) {
	        int range = 13; 

	        int first = 0;
	        int second = 1;

	        System.out.print("Fibonacci Series: ");
	        for (; first <= range; ) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        
	    }
	}

}
