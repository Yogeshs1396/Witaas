package testfunc;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 371;

		int on, rem, res = 0;

		on = number;

		while (on != 0)

		{
			rem = on % 10;
			res += Math.pow(rem, 3);
			on /= 10;

		}

		if (res == number)

		{
			System.out.println("Armstrong");
		}

		else

		{
			System.out.println(" not Armstrong");
		}

	}

}
