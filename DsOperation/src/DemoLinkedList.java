import java.util.*;
import java.util.LinkedList;
public class DemoLinkedList {

	public static void main(String[] args) {
		int n =5;
		
		LinkedList<Integer> numLst= new LinkedList<>();
		numLst.add(10);
		numLst.add(20);
		numLst.add(30);
		numLst.add(40);
		numLst.add(50);
		
		System.out.println(numLst);
		
		numLst.add(60);
		System.out.println(numLst);
		
		boolean containsElement=numLst.contains(30);
		System.out.println(containsElement);
		
		System.out.println(numLst.getFirst());
		
		System.out.println(numLst.getLast());
		
		numLst.addFirst(9);
		System.out.println(numLst);
		
		numLst.addLast(65);
		System.out.println(numLst);
		
//		numLst.clear();
//		System.out.println(numLst);
		
		Collection<String> lst = new LinkedList<String>();
		lst.add("supriya");
		lst.add("hello");
		lst.add("hii");
		System.out.println(lst);
		boolean IsEmpty=lst.isEmpty();
		System.out.println(IsEmpty);
		lst.remove("supriya");
		System.out.println(lst);
	}

}
