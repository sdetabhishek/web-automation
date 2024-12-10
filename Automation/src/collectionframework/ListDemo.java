package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("India");
		list.add("England");
		list.add("Australia");
		list.add("Kenya");
		
		for (String countries : list) {
			
			System.out.println(countries);
			
		}

	}

}
