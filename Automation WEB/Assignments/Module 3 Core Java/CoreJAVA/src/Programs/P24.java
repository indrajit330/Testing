package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P24 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(3.34);
		list.add(false);
		list.add('f');
		list.add(34657676);
		list.add(1);
		System.out.println(list);
		list.add(4565.565);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
	


