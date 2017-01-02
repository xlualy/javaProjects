
import java.util.*;
public class LlistDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("C");
		ll.add("G");
		ll.add("H");
		ll.add("I");
		ll.addLast("Z");	//Add at Last location
		ll.addFirst("A");  //Add at first location
		
		System.out.println("Orignal list "+ll);
		
		ll.add(1,"A1");          //Add at specific location
		System.out.println("After modification "+ll);
		
//		ll.removeFirst();
//		ll.removeLast();
		ll.set(2,ll.get(2)+" changed");
		System.out.println("After changed "+ll);
		
	}

}
