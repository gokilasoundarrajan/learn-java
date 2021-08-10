package collections;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		
		// Iterator has 3 methods
		// hasNext()
		// next()
		// remove()
		IteratorClass itr = new IteratorClass();
		ArrayList<String> animals = new ArrayList<String>();
		itr.addList(animals);
		
		itr.itrHasNextAndNext(animals);
		itr.itrRemove(animals);
	}
}

class IteratorClass {
	public void addList(ArrayList<String> animals) {
		animals.add("cat");
		animals.add("dog");
	}
	
	public void itrHasNextAndNext(ArrayList<String> animals) {
		Iterator<String> itr = animals.iterator();
		while(itr.hasNext()) {										// hasNext()
			System.out.println(itr.next());							// next()
		}
	}
	
	public void itrRemove(ArrayList<String> animals) {
		animals.add("Lion");
		Iterator<String> itr = animals.iterator();
		while(itr.hasNext()) {
			if("dog" == (String) itr.next() ) {
				itr.remove();										// remove()
			}
		}
		itrHasNextAndNext(animals);
	}
}
