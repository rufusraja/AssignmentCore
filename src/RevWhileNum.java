import java.util.Scanner;

public class RevWhileNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, nextn = 0;

		System.out.print("Enter number: ");

		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		while (n != 0) {
			nextn = nextn * 10;
			nextn = nextn + n % 10;
			n = n / 10;
		}

		System.out.println("Reverse of Number: " + nextn);
	}

}
