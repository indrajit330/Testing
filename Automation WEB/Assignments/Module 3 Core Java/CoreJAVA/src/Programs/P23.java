package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P23 {
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
   		list.add(3, true);
   		list.set(5, 'q');
   		System.out.println(list);
   		System.out.println(list.size());
   		
   		Iterator itr = list.iterator();
   		while(itr.hasNext()) {
   			System.out.println(itr.next());
   		}
   	}
   
}

