package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(101, "John");
		m.put(102, "Scott");
		m.put(103, "Bond");
		
		System.out.println(m);
		
		m.remove(101);
		
		System.out.println(m);

	}

}
