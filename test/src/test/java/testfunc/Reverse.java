package testfunc;

public class Reverse {

	public static void main(String args[])

	{

		String test = "yogesh";
		int size = test.length();

		for (int i = size-1; i >= 0; i--)

		{
			System.out.println(test.charAt(i));

		}

	}

}