
public class StringMethodJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stg1 = new String("Java Programing Language is important");
		String stg2 = new String("There are many concepts");
		String stg3 = new String("Welcome Home");
		String stg4 = new String("Welcome home");
		String stg5 = new String("HaPPy to sEe you  ");

		char stg = stg1.charAt(6);

		System.out.print("length() String length: ");
		System.out.println(stg1.length());
		System.out.println("");

		System.out.print("charAt() Index of Character: ");
		System.out.println(stg);
		System.out.println("");

		System.out.print("equals() Comparing string 1 & 2: ");
		System.out.println(stg1.equals(stg2));
		System.out.print("equals() Comparing string 3 & 4: ");
		// returns false since Case Sensitive
		System.out.println(stg3.equals(stg4));
		System.out.println("");

		System.out.print("equalsIgnoreCase() Comparing string 3 & 4: ");
		System.out.println(stg3.equalsIgnoreCase(stg4));
		System.out.println("");

		System.out.print("startsWith() String 3 starts with Wel: ");
		System.out.println(stg3.startsWith("Wel"));
		System.out.println("");

		System.out.print("endsWith() String 2 starts with ts: ");
		System.out.println(stg2.endsWith("ts"));
		System.out.println("");

		String[] words = stg1.split("\\s");
		System.out.print("split() Spliting each word & printing new Line");
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("");

		System.out.println("trim() to erase extra space in String 5");
		System.out.println(stg5 + "rufus");
		System.out.println(stg5.trim() + "rufus");
		System.out.println("");

		System.out.println("toLowerCase() for String 5");
		String stg5low = stg5.toLowerCase();
		System.out.println(stg5);
		System.out.println(stg5low);
		System.out.println("");

		System.out.println("toUpperCase() for String 5");
		String stg5up = stg5.toUpperCase();
		System.out.println(stg5);
		System.out.println(stg5up);
		System.out.println("");

		System.out.println("indexOf() to find index value");
		int indexval = stg2.indexOf("are");
		System.out.println("Index of character are in Sting 2 is " + indexval);
		System.out.println("");

		System.out.print("substring() for finding string value at particular index: ");
		System.out.println(stg1.substring(3, 14));
		System.out.println("");
	}

}
