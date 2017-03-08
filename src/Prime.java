import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine());
		int count = 0;
		int num = 2;
		while (count != N) {
			boolean Prime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					Prime = false;
					break;
				}

			}
			if (Prime) {
				count++;
				System.out.println(num);
			}
			num++;
		}
	}
}