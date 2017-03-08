import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
	static int calculateDuplicates(int[] numbers) {
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		int numberOfDuplicates = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (!numberMap.containsKey(numbers[i])) {
				numberMap.put(numbers[i], 1);
			} else {
				numberMap.put(numbers[i], numberMap.get(numbers[i]) + 1);
			}
		}

		for (Integer key : numberMap.keySet()) {
			if (numberMap.get(key) > 1) {
				numberOfDuplicates++;
			}
		}
		return numberOfDuplicates;
	}

	public static void main(String[] args) {
		System.out.print("Total number of duplicates: ");
		System.out.println(calculateDuplicates(new int[] { 1, 1, 2, 2, 2, 3, 4, 9, 3, 9 }));
	}
}
