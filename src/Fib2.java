import java.util.Scanner;

public class Fib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// @SuppressWarnings("resource")
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci Series till which Number: ");
		int n = input.nextInt();
		int count = 1;
		int c = 1, b = 1, a = 0;
		while (count <= n) {

			c = b + a;
			System.out.print(c + " ");
			a = b;
			b = c;

			count++;
		}
	}
}
