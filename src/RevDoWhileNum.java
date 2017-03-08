import java.util.Scanner;

public class RevDoWhileNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, nextn = 0;

		System.out.print("Enter Number: ");

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		do {
			nextn = nextn * 10;
			nextn = nextn + n % 10;
			n = n / 10;
		} while (n > 0);

		System.out.println("Number in Reverse: " + nextn);
	}

}
