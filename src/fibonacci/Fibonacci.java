package fibonacci;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static void main(String[] args) {
		int i = 15;
		for (; i > 0; i--) {
			System.out.println(fibonacci(i));			
		}
	}
}
