package testfunc;

public class Palindrom {

	public static void main(String[] args) {
		
	Palindrom.number();	
	Palindrom.string();
	}
	
	public static void string()
	
	{

		String test = "LOL";
		String temp="";
		int size = test.length();

		for (int i = size-1; i >= 0; i--)

		{
			temp+=test.charAt(i);
		}
	
		
		if(test.equals(temp))
			
		{
			System.out.println(test+" String is palindrome");
	    }

		else
			
		{
			System.out.println(test+" String is not a palindrome");
		}
	
	}
	public static void number()
	{

		int a = 454;
		int r;
		int temp;
		int sum = 0;

		temp = a;
		while (a > 0)

		{
			r = a % 10;// gives me remainder
			sum = (sum * 10) + r;// adding all remainders with multiplication of 10
			a = a / 10;// breaks the last digit

		}

		if (temp == sum)

		{
			System.out.println(temp+" is Palindrome no");
		} else {
			System.out.println(temp+" is Not a palindrome");
		}

	}

}
