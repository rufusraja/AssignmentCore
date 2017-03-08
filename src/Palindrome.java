import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome

{
	public static void main(String[] args) {
		Scanner palindrome = new Scanner(System.in);
		String input;
		{
			System.out.print("Enter Input: ");
			input = palindrome.next();
			if (isPalindrome(input))
				System.out.println("That is a palindrome.");
			else
				System.out.println("That is not a palindrome.");
		}
		while (input.length() != 0)
			;
	}

	public static boolean isPalindrome(String input) {
		Queue<Character> queue = new ArrayDeque<Character>();
		Stack<Character> stack = new Stack<Character>();
		Character letter;

		int count = 0;
		int i;
		for (i = 0; i < input.length(); i++) {
			letter = input.charAt(i);
			if (Character.isLetter(letter)) {
				queue.add(letter);
				stack.push(letter);
			}
		}
			while (!queue.isEmpty()) {
			if (queue.remove() != stack.pop())
				count++;
		}
		return (count == 0);
	}
}