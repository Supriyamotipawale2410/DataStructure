import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(11);
		lst.add(12);
		lst.add(13);
		lst.add(14);
		lst.add(15);
		
		System.out.println(lst);
		
		System.out.println("Element at index 2 : "+lst.get(2));
	}

}
