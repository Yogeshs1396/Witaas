package testfunc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iterator {

	public static void main(String[] args) {

		//test1();
		//test2();
		//PatternMatcher();
		//test3();
		
		
		

	}
	
	public static int fib(int n)
	{
		
		
		int f[] =new int[n+2];
		
		int i;
		f[0]=0;
		f[1]=1;
		
		
		for(i=2;i<=n;i++)
			
			
		{
			f[i]=f[i-1]+f[i+2];
			
		}
	
		return f[n];
		
		
		
	}

	public static void test1() {

		ArrayList<String> test = new ArrayList<String>();
		test.add("Yogesh");
		test.add("Sri");
		test.add("Atharvaa");
		test.add("Wipro Maha");
		test.add("Dilsh");

		System.out.println(test);
		Collections.sort(test);
		System.out.println(test);

		Iterator<String> it = test.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void test2()

	{

		Integer a = 1000;
		String b = a.toString();
		System.out.println(b.length());

	}
	
	public static void PatternMatcher()
	
	{
		Pattern pat=Pattern.compile("yogesh",Pattern.CASE_INSENSITIVE);
		Matcher mat= pat.matcher("yogesh works in WIPRO");
		boolean find= mat.find();
		
		if(find)
			
		{
			System.out.println("yogesh is found");
		}
		
		else
		{
			System.out.println("yogesh is found");
		}
	
	}
		public static void test3()
		
		{
			
			String s="Krishna";
			String t="Krishna";
			
			if(s==t)
			{
				System.out.println("hi");
			}
		
		}
		

	
}