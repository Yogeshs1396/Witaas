package testfunc;

public class Numreverse {

	public static void main(String[] args) {

		int n = 123, rev = 0;
		for (; n != 0; n /= 10) {
			int digi = n % 10;
			rev = rev * 10 + digi;
		}
		System.out.println(rev);

	}

}
