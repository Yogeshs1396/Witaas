package testfunc;

public class Prime {

	public static void main(String[] args) {

		int n = 5;
		Boolean prime = true;

		for (int i = 2; i <= n / 2; i++)

		{
			// for non prime
			if (n % i == 0)

			{
				prime = false;
				break;
			}
		}

		if (!prime)

		{
			System.out.println(n + " is not a prime number");
		}

		else {
			System.out.println(n + " is  a prime number");

		}

	}

}
