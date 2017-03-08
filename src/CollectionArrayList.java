import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		System.out.println("Initial Array Size: " + al.size());
		System.out.println("");

		al.add("M");
		al.add("A");
		al.add("N");
		al.add("G");
		al.add("O");
		System.out.println("Array Size after Adding elements: " + al.size());
		System.out.println("Array Contents: " + al);
		System.out.println("");

		
		al.remove("A");
		al.remove(1);
		System.out.println("Array Size after Removing elements: " + al.size());
		System.out.println("Array Contents: " + al);
		
	}
}
