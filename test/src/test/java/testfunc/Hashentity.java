package testfunc;

import java.util.HashMap;
import java.util.Set;

import org.w3c.dom.Entity;

public class Hashentity {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> h =new HashMap<Integer,String>();
		h.put(1, "DELL");
		h.put(2, "HP");
		h.put(3, "APPLE");
		h.put(4, "ACER");
		System.out.println(h);
		Set set=h.entrySet();
		h.remove(4);
		System.out.println(set);
		
	}

}
