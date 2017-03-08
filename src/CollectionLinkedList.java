import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();

		// add elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		//ll.addLast("S");
		//ll.addFirst("A");
		//ll.add(1, "");
		System.out.println("Initial Linked List Content: " + ll);
		System.out.println("");

		//ll.remove("P");
		ll.remove(1);
		System.out.println("Elements in Linked List after Deletion: " + ll);
		System.out.println("");

		//ll.removeFirst();
		//ll.removeLast();
		System.out.println("Deleting First & Last Element: " + ll);
		System.out.println("");

	}
}
