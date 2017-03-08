
public class StringBufferMethodJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("StringBuffer Implementation");
		StringBuffer stg1 = new StringBuffer("temperature");
		System.out.println("");

		System.out.println("1. Insert");
		stg1.insert(3, 7);
		System.out.println(stg1);
		System.out.println("");

		System.out.println("2. Append");
		stg1.append(" is nice");
		System.out.println(stg1);
		System.out.println("");

		System.out.println("3. Delete");
		stg1.delete(1, 3);
		System.out.println(stg1);
		System.out.println("");

		System.out.println("4. Replace");
		stg1.replace(2, 5, "ZZZ");
		System.out.println(stg1);
		System.out.println("");

		System.out.println("5. Reverse");
		stg1.reverse();
		System.out.println(stg1);
		System.out.println("");
	}
}