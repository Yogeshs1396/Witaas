package testfunc;

public class RecursiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Yogesh";
		System.out.println(RecursiveString.reverse(str));
		
	}
	
	public static String reverse(String s)
	
	{
		
		if((s.length()<=1) || s==null)
		{
		return s;
		}
		
		return reverse(s.substring(1))+s.charAt(0);
	
	}
	
}
