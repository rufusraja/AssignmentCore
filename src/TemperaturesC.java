import java.util.ArrayList;

public class TemperaturesC {

	public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(2);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89);
		weeklyTemperatures.add(94);
		weeklyTemperatures.add(2, 111);

		/*
		 * for (int j=0; j < weeklyTemperatures.size() ; j++) {
		 * System.out.println(weeklyTemperatures.get(j)); }
		 */

		for (Integer temperature : weeklyTemperatures) {
			System.out.println(temperature);
		}

		weeklyTemperatures.remove(2);// Removes element from a specific index
		System.out.println(weeklyTemperatures);

		weeklyTemperatures.remove((Integer) 2); // Removes the specific element
		System.out.println(weeklyTemperatures);

		weeklyTemperatures.forEach(Element -> System.out.print(Element + " "));

	}

}