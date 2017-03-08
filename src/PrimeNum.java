import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p1, num = 0, i, j;
		Scanner p = new Scanner(System.in);
		System.out.println("prime num frm 1 to ");
		p1 = p.nextInt();
		System.out.println("Prime nums are: ");

		for (i = 2; i <= p1; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					num = 0;
					break;
				}
			}
			if (num == 1)
				System.out.println(i);
			System.out.println("Value Assignmed"); 
		}
	}
}