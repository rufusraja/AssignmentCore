import java.util.Scanner;

public class charexp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v1 = 0, v2=0;
		boolean isContinue = true;
		do {
			try {
				System.out.print("Enter 2 numbers : ");
				String a = input.next();
				String b = input.next();
				v1 = Integer.parseInt(a);
				v2 = Integer.parseInt(b);
				isContinue = false;
				if ((v1 >= 10) && (v2 >=10))
				{
					System.out.println("Not between range 0-9");
				} 
				else if ((v1 <= 9) && (v2 <= 9))
				{
					System.out.println("Your good to go");
				} else 
				{
					System.out.println("Out of range");
				}
			} catch (NumberFormatException e) {
				System.out.println("Not an valid number");
			}
		} while (isContinue);

		//System.out.println("other character");
	}
}
