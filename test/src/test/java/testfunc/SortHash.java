package testfunc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class SortHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("yogesh", 1);
		h.put("yogesh2", 2);
		h.put("yogesh3", 3);

		System.out.println(" BEFORE SORTING KEY SET");
		for (String key : h.keySet()) {
			System.out.println(key);
		}
		System.out.println("BEFORE SORTING VALUE SET");
		for (Integer Values : h.values()) {
			System.out.println(Values);
		}
		
		TreeMap<String,Integer> t =new TreeMap<String,Integer>(h); 
		
		System.out.println("AFTER SORTING KEY SET");
		Iterator itr= t.keySet().iterator();
		while(itr.hasNext())
		{
			String key=(String) itr.next();
			System.out.println("NAMES="+key+"   VALUES="+h.get(key)); 
		}
		
		
		

	}

}
