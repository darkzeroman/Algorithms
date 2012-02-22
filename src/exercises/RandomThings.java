/**
 * 
 */
package exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author dkz
 * 
 */
public class RandomThings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(2);

		System.out.println("x");
		ArrayList<String> al = new ArrayList<String>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		ListIterator it = al.listIterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		

	}

}
