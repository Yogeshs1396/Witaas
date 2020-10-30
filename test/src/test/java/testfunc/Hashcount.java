package testfunc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Hashcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map < String, Integer > map = new 	HashMap <String, Integer > ();
		String sentence ="JAVA java PROGRAMMING IS OOPS";
		String[] seperate= sentence.split(" ");
		for(String s: seperate)
		{
			String word = s.toLowerCase();
			   if (map.containsKey(word)) {
			    int count = map.get(word); // get word count 
			    map.put(word, count + 1); // override word count
			   } else {
			    map.put(word, 1); // initial word count to 1
			   }
			
		}

		Set < String > keys = map.keySet(); // list of unique words because it's a Set

		  TreeSet < String > sortedKeys = new TreeSet <String > (keys); // ascending order of words

		  for (String str: sortedKeys) {

		   System.out.println("Word =" + str + " and it's count = " + map.get(str));

		  }
		
	}

}
