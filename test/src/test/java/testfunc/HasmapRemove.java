package testfunc;

import java.util.HashMap;

public class HasmapRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("yogesh", 1);
		h.put("yogesh2", 2);
		h.put("yogesh3", 3);
		
		System.out.println("KEY SET");
		for(String key:h.keySet())
		{
			System.out.println(key);
		}
		System.out.println("VALUE SET");
		for(Integer Values:h.values())
		{
			System.out.println(Values);
		}
		System.out.println("TO REMOVE KEY VALUE");
		System.out.println("REMOVED == "+h.remove("yogesh2"));
		System.out.println("KEY SET");
		for(String key:h.keySet())
		{
			System.out.println(key);
		}
		System.out.println("VALUE SET");
		for(Integer Values:h.values())
		{
			System.out.println(Values);
		}
		
	}

}
