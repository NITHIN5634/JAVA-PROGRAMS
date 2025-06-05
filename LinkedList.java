package javaprograms;
import java.util.*;

public class linklist {
	public static void main(String[] args) {
		//------------------------LinkedList---------------------------
		//A linkedlist is a way to store a list of items where each item points to the next one in the list
		// O -> O -> O -> O
		//Instead of keeping all the items next to each other as like array, a linkedlist keeps them connected using links like a chain
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.addFirst("@");
		ll.addLast("@");
		ll.add(2, "C");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		ll.remove(2);
		System.out.println(ll);
		System.out.println(ll.getFirst());
	}
}
 